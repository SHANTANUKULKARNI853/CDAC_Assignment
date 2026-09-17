package day7.Q2EventManagement.dao;

import java.util.ArrayList;
import Q2EventManagement.model.*;

public class EventDAO {

    ArrayList<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event e) {
        eventList.add(e);
    }

    public ArrayList<Event> getEvents() {
        return eventList;
    }
}