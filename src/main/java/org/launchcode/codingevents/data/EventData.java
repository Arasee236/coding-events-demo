package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.*;

public class EventData {

    // need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();

    // get all events
    public static Collection<Event> getAll() {
        return  events.values();
    }

    //get a single event
    public static Event getById(int id)
    {
        return events.get(id);
    }

    //add an event

    public static void addEvent(Event event){
        events.put(event.getId(),event);

    }

    //remove an event
    public static void removeEvent(int id){
        events.remove(id);
    }

//    //update an event
//
//    public static void editEvent(int id, String name, String description){
//        Event eventToedit = events.get(id);
//        eventToedit.setName(name);
//        eventToedit.setDescription(description);
//    }

}
