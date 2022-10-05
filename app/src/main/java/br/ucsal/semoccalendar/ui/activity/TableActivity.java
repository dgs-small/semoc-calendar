package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.ucsal.semoccalendar.R;
import br.ucsal.semoccalendar.model.Event;
import br.ucsal.semoccalendar.ui.adapter.EventListAdapter;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_table);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Mesas Redondas");

        RecyclerView recyclerView = findViewById(R.id.table_recycler_view);

        recyclerView.setAdapter(new EventListAdapter(this, listTest()));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private List<Event> listTest(){
        List<Event> events = new ArrayList<>();

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

        return events;
    }
}