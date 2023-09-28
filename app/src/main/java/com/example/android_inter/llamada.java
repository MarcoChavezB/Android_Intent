package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class llamada extends AppCompatActivity {

    Button btnToMensajes, btnToLlamada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);

        btnToMensajes = findViewById(R.id.siguiente);
        btnToLlamada = findViewById(R.id.anterior);

        btnToMensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(llamada.this, mensajes.class);
                startActivity(intent);
            }
        });

        btnToLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(llamada.this, correo.class);
                startActivity(intent);
            }
        });

    }

}