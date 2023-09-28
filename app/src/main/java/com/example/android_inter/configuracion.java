package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class configuracion extends AppCompatActivity {

    Button btnToCamara, btnToMensajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        btnToCamara = findViewById(R.id.siguiente);
        btnToMensajes = findViewById(R.id.anterior);

        btnToCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configuracion.this, camara.class);
                startActivity(intent);
            }
        });

        btnToMensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configuracion.this, mensajes.class);
                startActivity(intent);
            }
        });
    }
}