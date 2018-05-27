package com.example.george.eva2_8_intents_results;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    Intent inReceta;
    final static int LISTA_REST = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inReceta= new Intent(this,ListaRestaurante.class);
    }
    public void OnClick (View v){
        startActivityForResult(inReceta, LISTA_REST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == LISTA_REST){
            if (requestCode== Activity.RESULT_OK) {
                String sCade = data.getStringExtra("RESTA");
                Toast.makeText(this, sCade, Toast.LENGTH_SHORT).show();
            }
        }
    }

}
