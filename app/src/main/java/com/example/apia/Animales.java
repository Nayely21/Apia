package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Animales extends AppCompatActivity implements View.OnClickListener{

    ImageButton ovejaj,patoj,galloj,gatoj,vacaj,perroj,cerdoj,granjeroj;

    private MediaPlayer
            au_ove,
            au_pat,
            au_gall,
            au_gat,
            au_vac,
            au_perr,
            au_gran,
            au_cer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_animales);

        au_ove= MediaPlayer.create(Animales.this,R.raw.a_oveja);
        au_pat= MediaPlayer.create(Animales.this,R.raw.a_pato);
        au_gall= MediaPlayer.create(Animales.this,R.raw.a_gallo);
        au_gat= MediaPlayer.create(Animales.this,R.raw.a_gato);
        au_vac= MediaPlayer.create(Animales.this,R.raw.a_vaca);
        au_perr= MediaPlayer.create(Animales.this,R.raw.a_perro);
        au_cer= MediaPlayer.create(Animales.this,R.raw.a_cerdo);
        au_gran= MediaPlayer.create(Animales.this,R.raw.granjero);

        ovejaj = (ImageButton) findViewById(R.id.iboveja);
        ovejaj.setOnClickListener(this);

        patoj = (ImageButton) findViewById(R.id.ibpato);
        patoj.setOnClickListener(this);

        galloj = (ImageButton) findViewById(R.id.ibgallo);
        galloj.setOnClickListener(this);

        gatoj = (ImageButton) findViewById(R.id.ibgato);
        gatoj.setOnClickListener(this);

        vacaj = (ImageButton) findViewById(R.id.ibvaca);
        vacaj.setOnClickListener(this);

        perroj = (ImageButton) findViewById(R.id.ibperro);
        perroj.setOnClickListener(this);

        cerdoj = (ImageButton) findViewById(R.id.ibcerdo);
        cerdoj.setOnClickListener(this);

        granjeroj = (ImageButton) findViewById(R.id.ibgranjero);
        granjeroj.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.iboveja:
                au_ove.start();
                break;
            case R.id.ibpato:
                au_pat.start();
                break;
            case R.id.ibgallo:
                au_gall.start();
                break;
            case R.id.ibgato:
                au_gat.start();
                break;
            case R.id.ibvaca:
                au_vac.start();
                break;
            case R.id.ibperro:
                au_perr.start();
                break;
            case R.id.ibcerdo:
                au_cer.start();
                break;
            case R.id.ibgranjero:
                au_gran.start();
                break;
        }

    }
}