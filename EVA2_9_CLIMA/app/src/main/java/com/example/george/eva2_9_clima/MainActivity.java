package com.example.george.eva2_9_clima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lstVwLista;

    DatosTemperatura[] arregloClimas = {
            new DatosTemperatura(R.drawable.sunny, "Santa Barbara", 25, "Soleado"),
            new DatosTemperatura(R.drawable.cloudy, "Ojinaga", 17, "Nublado"),
            new DatosTemperatura(R.drawable.light_rain, "Delicias", 10, "Lluvia ligera"),
            new DatosTemperatura(R.drawable.sunny, "Camargo", 35, "Soleado"),
            new DatosTemperatura(R.drawable.rainy, "Cuauhtémoc", 11, "Lluvia"),
            new DatosTemperatura(R.drawable.light_rain, "Cd. Juárez", 20, "Lluvia ligera"),
            new DatosTemperatura(R.drawable.sunny, "Casas Grandes", 21, "Soleado"),
            new DatosTemperatura(R.drawable.rainy, "Jímenez", 15, "Lluvia")};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwLista = (ListView) findViewById(R.id.lstVwLista);
        lstVwLista.setAdapter(new ClimaAdapter(this, R.layout.clima_layout, arregloClimas));
        lstVwLista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent mostrarDet = new Intent(this, ClimaDetalle.class);
        Bundle bundleDatos = new Bundle();
        bundleDatos.putInt("imagen", arregloClimas[position].imagenClima);
        bundleDatos.putString("ciudad", arregloClimas[position].ciudad);
        bundleDatos.putInt("temperatura", arregloClimas[position].temperatura);
        bundleDatos.putString("descripcion", arregloClimas[position].descripcion);
        mostrarDet.putExtras(bundleDatos);
        startActivity(mostrarDet);
    }
}
