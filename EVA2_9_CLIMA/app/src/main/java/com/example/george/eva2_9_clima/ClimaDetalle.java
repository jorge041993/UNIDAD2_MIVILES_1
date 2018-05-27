package com.example.george.eva2_9_clima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ClimaDetalle extends AppCompatActivity {


    ImageView imgVwDet;
    TextView txtVwCiudadDet, txtVwTempDet, txtVwDescDet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima_detalle);

        imgVwDet = (ImageView) findViewById(R.id.imgVwDet);
        txtVwCiudadDet = (TextView) findViewById(R.id.txtVwCiudadDet);
        txtVwTempDet = (TextView) findViewById(R.id.txtVwTempDet);
        txtVwDescDet = (TextView) findViewById(R.id.txtVwDescDet);

        //Recuperar el intento que genero detalle
        Intent datos = getIntent();
        //Acceder al bundle
        Bundle bundleDatos = datos.getExtras();
        //Leer los datos
        imgVwDet.setImageResource(bundleDatos.getInt("imagen"));
        txtVwCiudadDet.setText(bundleDatos.getString("ciudad"));
        txtVwTempDet.setText(bundleDatos.getInt("temperatura") + "° C");
        txtVwDescDet.setText(bundleDatos.getString("descripcion"));
    }

    public void enClick(View view) {
        finish();
    }
}
