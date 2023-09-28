package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calendario extends AppCompatActivity {

    Button btnToMaps, btnToCamara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        btnToMaps = findViewById(R.id.siguiente);
        btnToCamara = findViewById(R.id.anterior);

        btnToMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calendario.this, maps.class);
                startActivity(intent);
            }
        });

        btnToCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(calendario.this, camara.class);
                startActivity(intent);
            }
        });
    }

}