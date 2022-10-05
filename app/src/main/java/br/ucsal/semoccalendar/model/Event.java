package br.ucsal.semoccalendar.model;

public class Event {

    private String schedule;
    private String name;

    public Event(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
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
}
