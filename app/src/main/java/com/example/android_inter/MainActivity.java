package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button iniciarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarButton = findViewById(R.id.iniciar);

        iniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, web_page.class);
                startActivity(intent);
            }
        });


    }











    /*
    public void abrirGithub(View view){
        String url = "https://github.com/MarcoChavezB";
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void mandarCorreo(View view){
        Intent intent= new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:marco1102004@gmail.com"));

        intent.putExtra(Intent.EXTRA_SUBJECT, "Prueba de intent en android");
        intent.putExtra(Intent.EXTRA_TEXT, "Hola, este es un correo de prueba");

        startActivity(intent);
    }

    public void realizarLlamada(View view){
        Button button = (Button) view;
    }

    public void mandarMensaje(View view){
        Button button = (Button) view;
    }

    public void abrirConfiguracion(View view){
        Button button = (Button) view;
    }

    public void abrirCamara(View view){
        Button button = (Button) view;
    }

    public void abrirCalendario(View view){
        Button button = (Button) view;
    }

    public void abrirMaps(View view){
        Button button = (Button) view;
    }


*/

}