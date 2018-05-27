package com.example.george.eva2_4_intentos_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Secundaria extends AppCompatActivity {
    Intent LanzarPrincipal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        LanzarPrincipal = new Intent(this, Principal.class);
    }
    public void onClick (View v){
        startActivity(LanzarPrincipal);
       // finish();
    }
}
