package br.ucsal.semoccalendar.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.semoccalendar.model.Event;

public class JourneyEventDAO {

    private static final List<Event> events = new ArrayList<>();

    static {
        events.add(new Event("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                "Geotecnologias aplicadas ao Planejamento Urbano e Desenvolvimento Social", "18/10 | 14h às 16h30"));

        events.add(new Event("TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                "Grupo de Pesquisa em Comunicação, Territorialidades e Culturas - COMTEC", "18/10 | 14h às 16h30"));

        events.add(new Event("TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                "Um Exame do Racismo Ambiental no Setor do Saneamento Básico", "18/10 | 14h às 16h30"));

        events.add(new Event("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                "Grupo de Pesquisa Territórios em Resistência", "18/10 | 14h às 16h30"));

        events.add(new Event("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                "Grupo de Pesquisa Gestão Democrática das Cidades", "19/10 | 14h às 16h30"));

        events.add(new Event("TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                "Grupo de Pesquisa Logoterapia e Análise existencial - LOGOS", "19/10 | às 16h30"));

        events.add(new Event("TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                "Grupo de Pesquisa Políticas Públicas e Gestão Escolar - GEPPGE", "19/10 | 14h às 16h30"));

        events.add(new Event("TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                "Grupo de Pesquisa Familia, Inclusão e Desenvolvimento Humano", "19/10 | 14h às 16h30"));

        events.add(new Event("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                "Grupo de Pesquisa Processos Urbanos e Direito à Cidade - DCidade", "20/10 | 14h às 16h30"));

        events.add(new Event("TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                "Coexistências territoriais: cooperações e disputas na relação Sociedade e Natureza", "20/10 | 14h às 16h30"));

        events.add(new Event("TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                "Justiça Criminal Soteropolitana - encarando a atuação e os limites", "20/10 | 14h às 16h30"));

        events.add(new Event("TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                "Grupo de Pesquisa Conservação e Evolução de Ecossistemas e da Biodiversidade - ConEEBio", "20/10 | 14h às 16h30"));
    }

    public List<Event> getEvents() {
        return new ArrayList<>(JourneyEventDAO.events);
    }
}
