package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class maps extends AppCompatActivity {

    Button btnToCalendar, abrirMaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        abrirMaps = findViewById(R.id.maps);
        btnToCalendar = findViewById(R.id.anterior);

        btnToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maps.this, calendario.class);
                startActivity(intent);
            }
        });

        abrirMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ubicacion = "geo:lat,lon?q=Universidad+Tecnologica+de+Torreon";
                Uri gmmIntentUri = Uri.parse(ubicacion);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}