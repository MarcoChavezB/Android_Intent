package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mensajes extends AppCompatActivity {

    Button btnToConfig, btnToMensajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);

        btnToConfig = findViewById(R.id.siguiente);
        btnToMensajes = findViewById(R.id.anterior);

        btnToConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mensajes.this, configuracion.class);
                startActivity(intent);
            }
        });

        btnToMensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mensajes.this, llamada.class);
                startActivity(intent);
            }
        });
    }

}