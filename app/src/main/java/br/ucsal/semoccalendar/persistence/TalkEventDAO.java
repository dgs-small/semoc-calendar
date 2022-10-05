package br.ucsal.semoccalendar.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.ucsal.semoccalendar.model.Event;

public class TalkEventDAO {

    private static final List<Event> events = new ArrayList<>();

    static {
        events.add(new Event("BATE PAPO SOBRE O COMITÊ DE ÉTICA EM PESQUISA (CEP)", "18/10 | 9:30 às 12h"));
        events.add(new Event("BATE PAPO SOBRE O CENTRO DE ESCRITA CIENTÍFICA (CEC)", "18/10 | 10h às 11h"));
        events.add(new Event("BATE PAPO SOBRE CARREIRA PROFISSIONAL", "20/10 | 9H às 11h"));
    }

    public List<Event> getEvents() {
        return new ArrayList<>(TalkEventDAO.events);
    }
}
