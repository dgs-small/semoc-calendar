package br.ucsal.semoccalendar.persistence;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.semoccalendar.model.Event;

public class EventDAO {
    private static final List<Event> events = new ArrayList<>();

    static {
        events.add(new Event(
                "BATE PAPO SOBRE O COMITÊ DE ÉTICA EM PESQUISA (CEP)",
                "18/10 | 9:30 às 12h",
                "SALA GOOGLE",
                "talk"
        ));

        events.add(new Event(
                "BATE PAPO SOBRE O CENTRO DE ESCRITA CIENTÍFICA (CEC)",
                "18/10 | 10h às 11h",
                "SALA GOOGLE",
                "talk"
        ));

        events.add(new Event(
                "BATE PAPO SOBRE CARREIRA PROFISSIONAL",
                "20/10 | 9H às 11h",
                "SALA GOOGLE",
                "talk"
        ));

        events.add(new Event(
                "CONFERÊNCIA DE ABERTURA",
                "17/10 | 18:30 às 21h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "Direitos Fundamentais, Efetividade e Jurisdição Constitucional",
                "18/10 | 9:30 às 12h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "Acessibilidade em Escolas Municipais: ir, estar e voltar",
                "18/10 | 9:30 às 12h",
                "SALA 201 - BLOCO B",
                "table"
        ));
        events.add(new Event(
                "EIXO 5: O PAPEL DA COMUNIDADE E DA FAMÍLIA NA EDUCAÇÃO INCLUSIVA\n" +
                        "\"Primeira infância primeiro\"",
                "18/10 | 9:30 às 12h",
                "AUDITÓRIO DA PÓS",
                "table"
        ));
        events.add(new Event(
                "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO\n" +
                        "Povos tradicionais e o direito ao território",
                "18/10 | 9:30 às 12h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "EIXO 4 : EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA\n" +
                        "O Olhar na História para Identificar os Caminhos da Ciência",
                "18/10 | 14 às 16:30h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "O PIBID e a Residência Pedagógica na UCSAL: Desafios e experiências\n" +
                        "da Inclusão na Educação Básica e a Formação de Professores",
                "18/10 | 18:30 às 12h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "Alteridade e busca de sentido para uma educação inclusiva e dialógica",
                "18/10 | 18:30 às 21h",
                "AUDITÓRIO DA PÓS",
                "table"
        ));
        events.add(new Event(
                "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                        "INCLUSÃO SOCIAL\n" +
                        "Instrumentos democráticos por uma educação inclusiva e efetiva",
                "18/10 | 18:30 às 21h",
                "SALA 201 - BLOCO B",
                "table"
        ));
        events.add(new Event(
                "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO\n" +
                        "Direito à moradia e violações na pandemia de COVID-19",
                "19/10 | 9:30 às 12h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "EIXO 4 : EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA\n" +
                        "Criminologia Crítica na América Latina: Punitivismo e Direitos Humanos",
                "19/10 | 9:30 às 12h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "Inclusão educacional das pessoas com deficiência e boas práticas",
                "19/10 | 9:30 às 12h",
                "SALA 201 - BLOCO B",
                "table"
        ));
        events.add(new Event(
                "EIXO 5: O PAPEL DA COMUNIDADE E DA FAMÍLIA NA EDUCAÇÃO INCLUSIVA\n" +
                        "Famílias e Educação: Novos olhares e reflexões sobre inclusão social",
                "19/10 | 9:30 às 12h",
                "AUDITÓRIO DA PÓS",
                "table"
        ));
        events.add(new Event(
                "EIXO 5: O PAPEL DA COMUNIDADE E DA FAMÍLIA NA EDUCAÇÃO INCLUSIVA\n" +
                        "A pessoa com deficiência no ensino superior: desafios e conquistas",
                "19/10 | 14 às 16:30h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 3: POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO\n" +
                        "A questão racial na educação e a luta por direitos",
                "19/10 | 18:30 às 21h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "A figura do poliedro em tempos de crise: o processo de inclusão e diálogo fraterno",
                "19/10 | 18:30 às 21h",
                "SALA 201 - BLOCO B",
                "table"
        ));
        events.add(new Event(
                "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO\n" +
                        "As cidades digitais, o Governo eletrônico e a participação popular",
                "20/10 | 9:30 às 12h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "EIXO 4 - EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA\n" +
                        "Bioética e Relação Médico-Paciente",
                "20/10 | 9:30 às 12h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 5: O PAPEL DA COMUNIDADE E DA FAMÍLIA NA EDUCAÇÃO INCLUSIVA AUDITÓRIO\n" +
                        "DA PÓS\n" +
                        "Envelhecimento e Educação Inclusiva: o idoso como sujeito de direitos",
                "18/10 | 9:30 às 12h",
                "AUDITÓRIO DA PÓS",
                "table"
        ));
        events.add(new Event(
                "EIXO 1 - RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                        "INCLUSÃO SOCIAL\n" +
                        "Racismo Ambiental, Refugiados Ambientais, Políticas Públicas e Inclusão Social",
                "20/10 | 18:30 às 21h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n" +
                        "Paradigmas, Constituição e Educação para e pelos Direitos Humanos",
                "20/10 | 18:30 às 21h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                        "INCLUSÃO SOCIAL\n" +
                        "Constituição, Política e Instituições Judiciais",
                "20/10 | 18:30 às 21h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                        "INCLUSÃO SOCIAL\n" +
                        "A educação inclusiva como meio de ressocialização no sistema carcerário",
                "20/10 | 18:30 às 21h",
                "AUDITÓRIO DA PÓS",
                "table"
        ));
        events.add(new Event(
                "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                        "INCLUSÃO SOCIAL\n" +
                        "Educação, inclusão e serviço social, interfaces da segregação",
                "20/10 | 18:30 às 21h",
                "SALA 201 - BLOCO B",
                "table"
        ));
        events.add(new Event(
                "EIXO 4 - EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA\n" +
                        "Pós-Humanismo como Novo Paradigma Jurídico para o Estudo da Terra",
                "21/10 | 9:30 às 12h",
                "AUDITÓRIO TÉRREO - BLOCO A",
                "table"
        ));
        events.add(new Event(
                "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                        "INCLUSÃO SOCIAL\n" +
                        "Políticas Públicas e Promoção das Capacidades",
                "21/10 | 9:30 às 12h",
                "AUDITÓRIO DA PÓS",
                "table"
        ));
        events.add(new Event(
                "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO\n" +
                        "Arbitragem Empresarial e Acesso à Justiça",
                "21/10 | 9:30 às 12h",
                "SALA 201 - BLOCO B",
                "table"
        ));
        events.add(new Event(
                "ENCERRAMENTO\n" +
                        "Inclusão social: o reverso da exclusão social?",
                "21/10 | 9:30 às 12h",
                "ONLINE YouTube - UCSAL Oficial",
                "table"
        ));
        events.add(new Event(
                "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                        "Geotecnologias aplicadas ao Planejamento Urbano e Desenvolvimento Social",
                "18/10 | 14h às 16h30",
                "SALA 201 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                        "Grupo de Pesquisa em Comunicação, Territorialidades e Culturas - COMTEC",
                "18/10 | 14h às 16h30",
                "SALA 203 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                        "Um Exame do Racismo Ambiental no Setor do Saneamento Básico",
                "18/10 | 14h às 16h30",
                "SALA 204 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                        "Grupo de Pesquisa Territórios em Resistência",
                "18/10 | 14h às 16h30",
                "SALA 205 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                        "Grupo de Pesquisa Gestão Democrática das Cidades",
                "19/10 | 14h às 16h30",
                "SALA 201 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                        "Grupo de Pesquisa Logoterapia e Análise existencial - LOGOS",
                "19/10 | às 16h30",
                "SALA 203 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                        "Grupo de Pesquisa Políticas Públicas e Gestão Escolar - GEPPGE",
                "19/10 | 14h às 16h30",
                "SALA 204 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                        "Grupo de Pesquisa Familia, Inclusão e Desenvolvimento Humano",
                "19/10 | 14h às 16h30",
                "SALA 205 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                        "Grupo de Pesquisa Processos Urbanos e Direito à Cidade - DCidade",
                "20/10 | 14h às 16h30",
                "SALA 201 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                        "Coexistências territoriais: cooperações e disputas na relação Sociedade e Natureza",
                "20/10 | 14h às 16h30",
                "SALA 203 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                        "Justiça Criminal Soteropolitana - encarando a atuação e os limites",
                "20/10 | 14h às 16h30",
                "SALA 204 - BLOCO B",
                "journey"
        ));

        events.add(new Event(
                "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                        "Grupo de Pesquisa Conservação e Evolução de Ecossistemas e da Biodiversidade - ConEEBio",
                "20/10 | 14h às 16h30",
                "SALA 205 - BLOCO B",
                "journey"
        ));
    }

    public List<Event> getTables() {
        List<Event> filteredList = new ArrayList<>();
        for(Event event: events) {
            if(event.getCategory() == "table") filteredList.add(event);
        }
        return filteredList;
    }

    public List<Event> getJourneys() {
        List<Event> filteredList = new ArrayList<>();
        for(Event event: events) {
            if(event.getCategory() == "journey") filteredList.add(event);
        }
        return filteredList;
    }

    public List<Event> getTalks() {
        List<Event> filteredList = new ArrayList<>();
        for(Event event: events) {
            if(event.getCategory() == "talk") filteredList.add(event);
        }
        return filteredList;
    }

    //    Simulate SQL select with %%
    public List<Event> searchByName(String query) {
        List<Event> filteredList = new ArrayList<>();
        for(Event event: events) {
            if(event.getName().contains(query)) filteredList.add(event);
        }
        return filteredList;
    }
}
