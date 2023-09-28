package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class correo extends AppCompatActivity {

    Button btnTollamada, btnCorreo, btnMandarCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        btnTollamada = findViewById(R.id.siguiente);
        btnCorreo = findViewById(R.id.anterior);
        btnMandarCorreo = findViewById(R.id.correo);

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

        btnMandarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:marco1102004@gmail.com"));

                intent.putExtra(Intent.EXTRA_SUBJECT, "Prueba de intent en android");
                intent.putExtra(Intent.EXTRA_TEXT, "Hola, este es un correo de prueba");

                startActivity(intent);
            }
        });
    }

}