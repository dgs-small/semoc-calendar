package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.List;
import java.util.Objects;

import br.ucsal.semoccalendar.R;
import br.ucsal.semoccalendar.model.Event;
import br.ucsal.semoccalendar.persistence.JourneyEventDAO;
import br.ucsal.semoccalendar.ui.adapter.EventListAdapter;

public class JourneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Jornada de Pesquisa");

        List<Event> events = new JourneyEventDAO().getEvents();

        RecyclerView recyclerView = findViewById(R.id.journey_recycler_view);

        recyclerView.setAdapter(new EventListAdapter(events));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    }
}