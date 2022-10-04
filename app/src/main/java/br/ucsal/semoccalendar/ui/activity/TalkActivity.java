package br.ucsal.semoccalendar.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import br.ucsal.semoccalendar.R;

public class TalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk);

        Button goBackButton = findViewById(R.id.talk_button_goback);
        goBackButton.setOnClickListener(view -> finish());
    }
}