package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        //Animacion
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView txtporunamejorcomunicacion = findViewById(R.id.txtporunamejorcomunicacion);
        TextView txtjugandoaprendo = findViewById(R.id.txtjugandoaprendo);
        TextView txttitulo = findViewById(R.id.txttitulo);
        ImageView ivbienvenida = findViewById(R.id.ivbienvenida);

        txtporunamejorcomunicacion.setAnimation(animacion2);
        txtjugandoaprendo.setAnimation(animacion2);
        txttitulo.setAnimation(animacion1);
        ivbienvenida.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}