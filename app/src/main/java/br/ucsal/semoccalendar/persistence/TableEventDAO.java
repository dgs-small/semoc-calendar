package br.ucsal.semoccalendar.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.semoccalendar.model.Event;

public class TableEventDAO {

    private static final List<Event> events = new ArrayList<>();

    static {
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
        events.add(new Event("EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA", "18/10 | 9:30 às 12h"));
    }

    public List<Event> getEvents() {
        return new ArrayList<>(TableEventDAO.events);
    }
}
