package com.example.george.eva2_8_intents_results;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaRestaurante extends AppCompatActivity implements  ListView.OnItemClickListener{

    String [] asReceta={"la jaiba feliz2",
            "la hacienda",
            "la calesa",
            "el puerco",
            "la buena sopa",
            "el 5 panes2",
            "la hacienda",
            "la calesa",
            "el puerco",
            "la buena sopa",
            "el 5 panes2",
            "la hacienda",
            "la calesa",
            "el puerco",
            "la buena sopa",
            "el 5 panes2"};
    ListView lista;
    Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
        lista= (ListView)findViewById(R.id.lista);
        inDatos = getIntent();
        ArrayAdapter<String>asListaRest = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, asReceta);
        lista.setAdapter(asListaRest);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
     inDatos.putExtra("RESTA",asReceta[i]);
     setResult(Activity.RESULT_OK, inDatos);
     finish();
    }
}
