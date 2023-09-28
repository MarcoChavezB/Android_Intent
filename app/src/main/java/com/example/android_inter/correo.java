package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class correo extends AppCompatActivity {

    Button btnTollamada, btnCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        btnTollamada = findViewById(R.id.siguiente);
        btnCorreo = findViewById(R.id.anterior);

        btnTollamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(correo.this, llamada.class);
                startActivity(intent);
            }
        });

        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(correo.this, web_page.class);
                startActivity(intent);
            }
        });
    }

}