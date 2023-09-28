package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;

public class llamada extends AppCompatActivity {

    private static final int REQUEST_CALL_PERMISSION = 1;
    Button btnToMensajes, btnToLlamada, hacerLlamada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);

        btnToMensajes = findViewById(R.id.siguiente);
        btnToLlamada = findViewById(R.id.anterior);
        hacerLlamada = findViewById(R.id.llamada);

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

        hacerLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = "6242647089";
                if (ContextCompat.checkSelfPermission(llamada.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(llamada.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL_PERMISSION);
                } else {
                    realizarLlamada(numero);
                }
            }
        });
    }


    private void realizarLlamada(String numero) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + numero));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                realizarLlamada("6242647089");
            }
        }
    }
}
