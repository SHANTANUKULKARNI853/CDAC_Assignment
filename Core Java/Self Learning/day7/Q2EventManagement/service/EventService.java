package day7.Q2EventManagement.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import Q2EventManagement.dao.*;
import Q2EventManagement.model.*;

public class EventService {

    EventDAO dao = new EventDAO();

    public void addEvent(Event e) {
        dao.addEvent(e);
    }

    public long getDuration(Event e) {
        return ChronoUnit.DAYS.between(
                e.getStartDate(),
                e.getEndDate()
        );
    }

    public String getStatus(Event e) {

        LocalDate today = LocalDate.now();

        if (today.isBefore(e.getStartDate())) {
            return "Upcoming";
        } else if (today.isAfter(e.getEndDate())) {
            return "Completed";
        } else {
            return "Ongoing";
        }
    }

    public boolean isOverlapping(Event e1, Event e2) {

        if (e1.getStartDate().isAfter(e2.getEndDate())) {
            return false;
        }

        if (e2.getStartDate().isAfter(e1.getEndDate())) {
            return false;
        }

        return true;
    }

    public Event getEarliestEvent() {

        ArrayList<Event> eventList = dao.getEvents();

        if (eventList.size() == 0) {
            return null;
        }

        Event earliest = eventList.get(0);

        for (Event e : eventList) {
            if (e.getStartDate().isBefore(earliest.getStartDate())) {
                earliest = e;
            }
        }

        return earliest;
    }

    public Event getLatestEvent() {

        ArrayList<Event> eventList = dao.getEvents();

        if (eventList.size() == 0) {
            return null;
        }

        Event latest = eventList.get(0);

        for (Event e : eventList) {
            if (e.getStartDate().isAfter(latest.getStartDate())) {
                latest = e;
            }
        }

        return latest;
    }

    public long getDaysRemaining(Event e) {

        LocalDate today = LocalDate.now();

        if (!e.getStartDate().isAfter(today)) {
            return 0;
        }

        return ChronoUnit.DAYS.between(
                today,
                e.getStartDate()
        );
    }

    public void displayEventsInRange(
            LocalDate fromDate,
            LocalDate toDate) {

        if (fromDate.isAfter(toDate)) {
            System.out.println("Invalid date range.");
            return;
        }

        boolean found = false;

        for (Event e : dao.getEvents()) {

            if (!e.getEndDate().isBefore(fromDate)
                    && !e.getStartDate().isAfter(toDate)) {

                e.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No events found in this date range.");
        }
    }

	public ArrayList<Event> getEvents() {
		// TODO Auto-generated method stub
		return dao.getEvents();
	}
}
