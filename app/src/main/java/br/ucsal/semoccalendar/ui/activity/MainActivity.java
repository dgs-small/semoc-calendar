package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import br.ucsal.semoccalendar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Seja bem vindo!", Toast.LENGTH_SHORT).show();

        Button tableButton = findViewById(R.id.main_button_table);
        Button journeyButton = findViewById(R.id.main_button_journey);
        Button talkButton = findViewById(R.id.main_button_talk);

        Intent tableIntent = new Intent(this, TableActivity.class);
        Intent journeyIntent = new Intent(this, JourneyActivity.class);
        Intent talkIntent = new Intent(this, TalkActivity.class);

        tableButton.setOnClickListener(view -> startActivity(tableIntent));
        journeyButton.setOnClickListener(view -> startActivity(journeyIntent));
        talkButton.setOnClickListener(view -> startActivity(talkIntent));


    }
}