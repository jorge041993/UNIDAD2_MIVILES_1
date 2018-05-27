package com.example.george.eva2_4_intentos_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    Intent inLanzarSecundaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inLanzarSecundaria = new Intent(this, Secundaria.class);
    }
    public void onClick (View v){
        startActivity(inLanzarSecundaria);
    }
}
