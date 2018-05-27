package com.example.george.eva2_1_intentos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    EditText numero;
    Intent inLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        numero = (EditText)findViewById(R.id.numero);
    }
    public void onClick (View v) {
        String sCade = numero.getText().toString();
        //protocolo:numero --> tel:
        sCade = "Tel:" + sCade;
        inLlamar = new Intent(Intent.ACTION_DIAL, Uri.parse(sCade));
        startActivity(inLlamar);
    }
}
