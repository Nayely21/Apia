package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Trabalenguas extends AppCompatActivity implements View.OnClickListener{

    ImageButton t1,t2,t3;

    private MediaPlayer
            au_t1,
            au_t2,
            au_t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_trabalenguas);

        au_t1= MediaPlayer.create(Trabalenguas.this,R.raw.t_1);
        au_t2= MediaPlayer.create(Trabalenguas.this,R.raw.t_2);
        au_t3= MediaPlayer.create(Trabalenguas.this,R.raw.t_3);

        t1 = (ImageButton) findViewById(R.id.ibt1);
        t1.setOnClickListener(this);

        t2 = (ImageButton) findViewById(R.id.ibt2);
        t2.setOnClickListener(this);

        t3 = (ImageButton) findViewById(R.id.ibt3);
        t3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ibt1:
                au_t1.start();
                break;
            case R.id.ibt2:
                au_t2.start();
                break;
            case R.id.ibt3:
                au_t3.start();
                break;
        }

    }
}