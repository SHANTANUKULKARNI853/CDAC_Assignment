package day7.Q2EventManagement.test;

/*
Design and implement a Java-based Event Management System using
the java.time.LocalDate class.

The system should allow users to:
Create an event by entering its name, start date, and end date.
Determine the duration of the event in days.
Check whether an event is upcoming, ongoing, or completed.
Identify whether two events overlap with each other.
Find the earliest and latest event from a collection of events.
Calculate the number of days remaining until an upcoming event.
Display all events scheduled within a specified date range.
Handle invalid date ranges appropriately.
*/

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Q2EventManagement.model.Event;
import Q2EventManagement.service.EventService;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventService service = new EventService();

        while (true) {

            System.out.println("\n1. Create Event");
            System.out.println("2. Display All Events");
            System.out.println("3. Event Duration");
            System.out.println("4. Event Status");
            System.out.println("5. Check Event Overlap");
            System.out.println("6. Earliest Event");
            System.out.println("7. Latest Event");
            System.out.println("8. Days Remaining");
            System.out.println("9. Events Within Date Range");
            System.out.println("10. Exit");

            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            try {

                switch (choice) {

                case 1:

                    System.out.println("Enter event name:");
                    String name = sc.nextLine();

                    System.out.println("Enter start date (yyyy-mm-dd):");
                    LocalDate startDate =
                            LocalDate.parse(sc.nextLine());

                    System.out.println("Enter end date (yyyy-mm-dd):");
                    LocalDate endDate =
                            LocalDate.parse(sc.nextLine());

                    if (startDate.isAfter(endDate)) {
                        System.out.println(
                                "Invalid date range. Start date cannot be after end date.");
                        break;
                    }

                    Event e = new Event(
                            name,
                            startDate,
                            endDate
                    );

                    service.addEvent(e);

                    System.out.println("Event created successfully.");
                    break;

                case 2:

                    for (Event event : service.getEvents()) {
                        event.display();
                    }

                    break;

                case 3:

                    System.out.println("Enter event ID:");
                    int id = sc.nextInt();

                    Event event = findEvent(service, id);

                    if (event != null) {
                        System.out.println(
                                "Duration = "
                                + service.getDuration(event)
                                + " days");
                    } else {
                        System.out.println("Event not found.");
                    }

                    break;

                case 4:

                    System.out.println("Enter event ID:");
                    id = sc.nextInt();

                    event = findEvent(service, id);

                    if (event != null) {
                        System.out.println(
                                "Status: "
                                + service.getStatus(event));
                    } else {
                        System.out.println("Event not found.");
                    }

                    break;

                case 5:

                    System.out.println("Enter first event ID:");
                    int id1 = sc.nextInt();

                    System.out.println("Enter second event ID:");
                    int id2 = sc.nextInt();

                    Event e1 = findEvent(service, id1);
                    Event e2 = findEvent(service, id2);

                    if (e1 != null && e2 != null) {

                        if (service.isOverlapping(e1, e2)) {
                            System.out.println("Events overlap.");
                        } else {
                            System.out.println("Events do not overlap.");
                        }

                    } else {
                        System.out.println("Event not found.");
                    }

                    break;

                case 6:

                    event = service.getEarliestEvent();

                    if (event != null) {
                        System.out.println("Earliest Event:");
                        event.display();
                    } else {
                        System.out.println("No events available.");
                    }

                    break;

                case 7:

                    event = service.getLatestEvent();

                    if (event != null) {
                        System.out.println("Latest Event:");
                        event.display();
                    } else {
                        System.out.println("No events available.");
                    }

                    break;

                case 8:

                    System.out.println("Enter event ID:");
                    id = sc.nextInt();

                    event = findEvent(service, id);

                    if (event != null) {

                        if (service.getStatus(event).equals("Upcoming")) {

                            System.out.println(
                                    "Days remaining: "
                                    + service.getDaysRemaining(event));

                        } else {
                            System.out.println(
                                    "Event is not upcoming.");
                        }

                    } else {
                        System.out.println("Event not found.");
                    }

                    break;

                case 9:

                    sc.nextLine();

                    System.out.println("Enter from date (yyyy-mm-dd):");
                    LocalDate fromDate =
                            LocalDate.parse(sc.nextLine());

                    System.out.println("Enter to date (yyyy-mm-dd):");
                    LocalDate toDate =
                            LocalDate.parse(sc.nextLine());

                    service.displayEventsInRange(
                            fromDate,
                            toDate);

                    break;

                case 10:

                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
                }

            } catch (DateTimeParseException ex) {

                System.out.println(
                        "Invalid date format. Use yyyy-mm-dd.");

            } catch (Exception ex) {

                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }
    }

    public static Event findEvent(
            EventService service, int id) {

        for (Event e : service.getEvents()) {

            if (e.getId() == id) {
                return e;
            }
        }

        return null;
    }
}
