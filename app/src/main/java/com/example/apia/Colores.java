package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Colores extends AppCompatActivity implements View.OnClickListener {

    ImageButton rojoj,amarilloj,azulj,blancoj,rosadoj,verdej,negroj,naranjaj;

    private MediaPlayer
            au_rojo,
            au_amarillo,
            au_azul,
            au_blanco,
            au_rosado,
            au_verde,
            au_negro,
            au_naranja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_colores);

        au_rojo= MediaPlayer.create(Colores.this,R.raw.c_rojo);
        au_amarillo= MediaPlayer.create(Colores.this,R.raw.c_amarillo);
        au_azul= MediaPlayer.create(Colores.this,R.raw.c_azul);
        au_blanco= MediaPlayer.create(Colores.this,R.raw.c_blanco);
        au_rosado= MediaPlayer.create(Colores.this,R.raw.c_rosa);
        au_verde= MediaPlayer.create(Colores.this,R.raw.c_verde);
        au_negro= MediaPlayer.create(Colores.this,R.raw.c_negro);
        au_naranja= MediaPlayer.create(Colores.this,R.raw.c_naranja);

        rojoj = (ImageButton) findViewById(R.id.ibrojo);
        rojoj.setOnClickListener(this);

        amarilloj = (ImageButton) findViewById(R.id.ibamarillo);
        amarilloj.setOnClickListener(this);

        azulj = (ImageButton) findViewById(R.id.ibazul);
        azulj.setOnClickListener(this);

        blancoj = (ImageButton) findViewById(R.id.ibblanco);
        blancoj.setOnClickListener(this);

        rosadoj = (ImageButton) findViewById(R.id.ibrosa);
        rosadoj.setOnClickListener(this);

        verdej = (ImageButton) findViewById(R.id.ibverde);
        verdej.setOnClickListener(this);

        negroj = (ImageButton) findViewById(R.id.ibnegro);
        negroj.setOnClickListener(this);

        naranjaj = (ImageButton) findViewById(R.id.ibnaranja);
        naranjaj.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ibrojo:
                au_rojo.start();
                break;
            case R.id.ibamarillo:
                au_amarillo.start();
                break;
            case R.id.ibazul:
                au_azul.start();
                break;
            case R.id.ibblanco:
                au_blanco.start();
                break;
            case R.id.ibrosa:
                au_rosado.start();
                break;
            case R.id.ibverde:
                au_verde.start();
                break;
            case R.id.ibnegro:
                au_negro.start();
                break;
            case R.id.ibnaranja:
                au_naranja.start();
                break;
        }

    }
}