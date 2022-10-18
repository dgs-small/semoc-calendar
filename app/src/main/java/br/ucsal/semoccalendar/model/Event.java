package br.ucsal.semoccalendar.model;

public class Event {
    private String schedule;
    private String name;
    private String place;
    private String category;

    public Event(String name, String schedule, String place, String category) {
        this.name = name;
        this.schedule = schedule;
        this.place = place;
        this.category = category;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = Event.this.category;
    }
}
