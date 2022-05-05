package com.example.apia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);
    }

    public void sonidos(View view){
        Intent sonidos = new Intent(Menu.this,Splashsonido.class);
        startActivity(sonidos);
    }

    public void trabalenguas(View view){
        Intent trabalenguas = new Intent(Menu.this,splashtrabalenguas.class);
        startActivity(trabalenguas);
    }

    public void rimas(View view){
        Intent rimas = new Intent(Menu.this,Splashrimas.class);
        startActivity(rimas);
    }

    public void adivinanzas(View view){
        Intent adivinanzas = new Intent(Menu.this,Splasadivinanzas.class);
        startActivity(adivinanzas);
    }
}