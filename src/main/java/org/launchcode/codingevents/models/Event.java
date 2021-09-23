package org.launchcode.codingevents.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Event {
    private int id;
    private static int nextId =1;

    @Size(min=3, max=50, message = "Name must be between 3 and 50 characters.")
    @NotBlank(message = "Name is required.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank(message="Location cannot be left blank.")
    private String location;

    @Positive(message="Number of attendees must be one or more.")
    private int numberOfAttendees;

    public Event(String name,String description,String location,int numberOfAttendees) {
        this.name = name;
        this.description= description;
        this.location=location;
        this.numberOfAttendees =numberOfAttendees;
        this.id= nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
