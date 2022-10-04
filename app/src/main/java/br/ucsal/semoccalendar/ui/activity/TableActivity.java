package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import br.ucsal.semoccalendar.R;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        
        Button goBackButton = findViewById(R.id.table_button_goback);
        goBackButton.setOnClickListener(view -> finish());
    }
}