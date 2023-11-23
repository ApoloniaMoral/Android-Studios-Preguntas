package com.example.preguntapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add listener to play Card
        CardView play = findViewById(R.id.cardview1);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent playIntent = new Intent(MainActivity.this, jugarActividad.class);
                    startActivity(playIntent);

                    }

            });

        CardView help = findViewById(R.id.cardView2);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent helpIntent = new Intent( MainActivity.this, helpActividad.class);
                startActivity(helpIntent);
            }
        });

    }
}