package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Sonidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sonidos);
    }

    public void numeros(View view){
        Intent numeros = new Intent(Sonidos.this,Numeros.class);
        startActivity(numeros);
    }

    public void colores(View view){
        Intent colores = new Intent(Sonidos.this,Colores.class);
        startActivity(colores);
    }

    public void animales(View view){
        Intent animales = new Intent(Sonidos.this,Animales.class);
        startActivity(animales);
    }
}