package com.example.mentaldisorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitlePage extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_page);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startProgram();
            }
        });
    }

    private void startProgram() {
        Intent intent = new Intent(TitlePage.this, MainActivity.class);
        startActivity(intent);
    }
}
