package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class camara extends AppCompatActivity {

    Button btnToCalendar, btnToConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);

        btnToCalendar = findViewById(R.id.siguiente);
        btnToConfig = findViewById(R.id.anterior);

        btnToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(camara.this, calendario.class);
                startActivity(intent);
            }
        });

        btnToConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(camara.this, configuracion.class);
                startActivity(intent);
            }
        });
    }

}