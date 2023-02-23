package com.github.MariemBaccari.mediato;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        TextView greetings = (TextView) findViewById(R.id.greetingMessage);
        greetings.setText("Greetings " + name + " !");
    }
}