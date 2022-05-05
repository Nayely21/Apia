package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Rimas extends AppCompatActivity implements View.OnClickListener{

    ImageButton r1,r2,r3;

    private MediaPlayer
            au_r1,
            au_r2,
            au_r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_rimas);

        au_r1= MediaPlayer.create(Rimas.this,R.raw.r_1);
        au_r2= MediaPlayer.create(Rimas.this,R.raw.r_2);
        au_r3= MediaPlayer.create(Rimas.this,R.raw.r_3);

        r1 = (ImageButton) findViewById(R.id.ibr1);
        r1.setOnClickListener(this);

        r2 = (ImageButton) findViewById(R.id.ibr2);
        r2.setOnClickListener(this);

        r3 = (ImageButton) findViewById(R.id.ibr3);
        r3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ibr1:
                au_r1.start();
                break;
            case R.id.ibr2:
                au_r2.start();
                break;
            case R.id.ibr3:
                au_r3.start();
                break;
        }

    }
}