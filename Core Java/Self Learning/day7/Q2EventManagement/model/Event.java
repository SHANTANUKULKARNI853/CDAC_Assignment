package day7.Q2EventManagement.model;

import java.time.LocalDate;

public class Event {

    private int id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    private static int counter = 100;

    public Event(String name, LocalDate startDate, LocalDate endDate) {
        this.id = ++counter;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("------------------------");
    }
}