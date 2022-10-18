package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.List;
import java.util.Objects;

import br.ucsal.semoccalendar.R;
import br.ucsal.semoccalendar.model.Event;
import br.ucsal.semoccalendar.persistence.EventDAO;
import br.ucsal.semoccalendar.ui.adapter.EventListAdapter;

public class ListActivity extends AppCompatActivity {

    private final EventDAO eventDAO = new EventDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        Objects.requireNonNull(getSupportActionBar()).setTitle(getIntent().getStringExtra("title"));

        List<Event> events;

        String type = getIntent().getStringExtra("type");

        switch (type) {
            case "talk" -> events = eventDAO.getTalks();
            case "journey" -> events = eventDAO.getJourneys();
            case "table" -> events = eventDAO.getTables();
            default -> throw new RuntimeException("Type does not exists.");
        }

        RecyclerView recyclerView = findViewById(R.id.list_recycler_view);
        EditText searchInput = findViewById(R.id.list_input_search);

        searchInput.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        recyclerView.setAdapter(new EventListAdapter(events));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    }
}