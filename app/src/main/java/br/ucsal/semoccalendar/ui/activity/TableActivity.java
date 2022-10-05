package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.semoccalendar.R;
import br.ucsal.semoccalendar.model.Event;
import br.ucsal.semoccalendar.ui.adapter.EventListAdapter;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        
        Button goBackButton = findViewById(R.id.table_button_goback);

        RecyclerView recyclerView = findViewById(R.id.table_recycler_view);

        recyclerView.setAdapter(new EventListAdapter(this, listTest()));

        goBackButton.setOnClickListener(view -> finish());
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