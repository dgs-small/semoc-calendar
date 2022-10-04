package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import br.ucsal.semoccalendar.R;

public class JourneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);

        Button goBackButton = findViewById(R.id.journey_button_goback);
        goBackButton.setOnClickListener(view -> finish());
    }
}