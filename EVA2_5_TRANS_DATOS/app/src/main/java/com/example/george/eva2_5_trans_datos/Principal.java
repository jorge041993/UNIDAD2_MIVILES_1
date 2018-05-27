package com.example.george.eva2_5_trans_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    Intent inLanzarSecundaria;
    EditText enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        enviar = (EditText) findViewById(R.id.enviar);
        inLanzarSecundaria = new Intent(this, Secundaria.class);
    }
    public void onClick (View v){
        String sCade = enviar.getText().toString();
        inLanzarSecundaria.putExtra("MENSAJE", sCade);
        startActivity(inLanzarSecundaria);
    }
}
