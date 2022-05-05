package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Adivinanzas extends AppCompatActivity implements View.OnClickListener {

    ImageButton a_1,a_2,a_3,a_4;

    private MediaPlayer
            au_a1,
            au_a2,
            au_a3,
            au_a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_adivinanzas);

        au_a1= MediaPlayer.create(Adivinanzas.this,R.raw.a_1);
        au_a2= MediaPlayer.create(Adivinanzas.this,R.raw.a_2);
        au_a3= MediaPlayer.create(Adivinanzas.this,R.raw.a_3);
        au_a4= MediaPlayer.create(Adivinanzas.this,R.raw.a_4);

        a_1 = (ImageButton) findViewById(R.id.iba1);
        a_1.setOnClickListener(this);

        a_2 = (ImageButton) findViewById(R.id.iba2);
        a_2.setOnClickListener(this);

        a_3 = (ImageButton) findViewById(R.id.iba3);
        a_3.setOnClickListener(this);

        a_4 = (ImageButton) findViewById(R.id.iba4);
        a_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.iba1:
                au_a1.start();
                break;
            case R.id.iba2:
                au_a2.start();
                break;
            case R.id.iba3:
                au_a3.start();
                break;
            case R.id.iba4:
                au_a4.start();
                break;
        }

    }
}