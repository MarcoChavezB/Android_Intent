package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;

public class mensajes extends AppCompatActivity {

    Button btnToConfig, btnToMensajes, mandarMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensajes);

        btnToConfig = findViewById(R.id.siguiente);
        btnToMensajes = findViewById(R.id.anterior);
        mandarMensaje = findViewById(R.id.msg);

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

        mandarMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:" + Uri.encode("6242647089")));
                intent.putExtra("sms_body", "Mensaje de prueba Android");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

}