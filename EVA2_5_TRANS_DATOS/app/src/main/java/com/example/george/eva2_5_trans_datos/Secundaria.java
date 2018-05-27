package com.example.george.eva2_5_trans_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView mensaje;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        mensaje = (TextView) findViewById(R.id.mensaje);
           Intent inDatos = getIntent();
           String sCade = inDatos.getStringExtra("MENSAJE");
           mensaje.setText(sCade);
    }
    public void onClick (View v){

        finish();
    }
}
