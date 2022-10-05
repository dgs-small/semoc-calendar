package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.List;
import java.util.Objects;

import br.ucsal.semoccalendar.R;
import br.ucsal.semoccalendar.model.Event;
import br.ucsal.semoccalendar.persistence.TableEventDAO;
import br.ucsal.semoccalendar.ui.adapter.EventListAdapter;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_table);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Mesas Redondas");

        List<Event> events = new TableEventDAO().getEvents();

        RecyclerView recyclerView = findViewById(R.id.table_recycler_view);

        recyclerView.setAdapter(new EventListAdapter(events));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}