package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Numeros extends AppCompatActivity implements View.OnClickListener {

    ImageButton unoj,dosj,tresj,cuatroj,cincoj,seisj,sietej,ochoj,nuevej,diezj;

    private MediaPlayer
    au_uno,
    au_dos,
    au_tres,
    au_cuatro,
    au_cinco,
    au_seis,
    au_siete,
    au_ocho,
    au_nueve,
    au_diez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_numeros);

        au_uno= MediaPlayer.create(Numeros.this,R.raw.n_uno);
        au_dos= MediaPlayer.create(Numeros.this,R.raw.n_dos);
        au_tres= MediaPlayer.create(Numeros.this,R.raw.n_tres);
        au_cuatro= MediaPlayer.create(Numeros.this,R.raw.n_cuatro);
        au_cinco= MediaPlayer.create(Numeros.this,R.raw.n_cinco);
        au_seis= MediaPlayer.create(Numeros.this,R.raw.n_seis);
        au_siete= MediaPlayer.create(Numeros.this,R.raw.n_siete);
        au_ocho= MediaPlayer.create(Numeros.this,R.raw.n_ocho);
        au_nueve= MediaPlayer.create(Numeros.this,R.raw.n_nueve);
        au_diez= MediaPlayer.create(Numeros.this,R.raw.n_diez);

        unoj = (ImageButton) findViewById(R.id.ibuno);
        unoj.setOnClickListener(this);

        dosj = (ImageButton) findViewById(R.id.ibdos);
        dosj.setOnClickListener(this);

        tresj = (ImageButton) findViewById(R.id.ibtres);
        tresj.setOnClickListener(this);

        cuatroj = (ImageButton) findViewById(R.id.ibcuatro);
        cuatroj.setOnClickListener(this);

        cincoj = (ImageButton) findViewById(R.id.ibcinco);
        cincoj.setOnClickListener(this);

        seisj = (ImageButton) findViewById(R.id.ibseis);
        seisj.setOnClickListener(this);

        sietej = (ImageButton) findViewById(R.id.ibsiete);
        sietej.setOnClickListener(this);

        ochoj = (ImageButton) findViewById(R.id.ibocho);
        ochoj.setOnClickListener(this);

        nuevej = (ImageButton) findViewById(R.id.ibnueve);
        nuevej.setOnClickListener(this);

        diezj = (ImageButton) findViewById(R.id.ibdiez);
        diezj.setOnClickListener(this);




    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ibuno:
                au_uno.start();
                break;
            case R.id.ibdos:
                au_dos.start();
                break;
            case R.id.ibtres:
                au_tres.start();
                break;
            case R.id.ibcuatro:
                au_cuatro.start();
                break;
            case R.id.ibcinco:
                au_cinco.start();
                break;
            case R.id.ibseis:
                au_seis.start();
                break;
            case R.id.ibsiete:
                au_siete.start();
                break;
            case R.id.ibocho:
                au_ocho.start();
                break;
            case R.id.ibnueve:
                au_nueve.start();
                break;
            case R.id.ibdiez:
                au_diez.start();
                break;
        }

    }
}