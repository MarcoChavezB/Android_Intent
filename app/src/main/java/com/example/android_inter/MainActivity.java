package com.example.android_inter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirGithub(View view){
        Button button = (Button) view;
    }

    public void mandarCorreo(View view){
        Button button = (Button) view;
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




}