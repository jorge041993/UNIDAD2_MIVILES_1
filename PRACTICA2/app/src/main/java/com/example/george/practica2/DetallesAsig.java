package com.example.george.practica2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by George on 23/04/2018.
 */

public class DetallesAsig  extends AppCompatActivity {

    ImageView imgVwDoc;
    TextView txtVwAsignatura, txtVwCreditos, txtVwDocente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deta_asig);
        imgVwDoc = (ImageView) findViewById(R.id.imgVwDoc);
        txtVwAsignatura = (TextView) findViewById(R.id.txtVwAsignatura);
        txtVwCreditos = (TextView) findViewById(R.id.txtVwCreditos);
        txtVwDocente = (TextView) findViewById(R.id.txtVwDocente);

        Intent intentObtenido = getIntent();
        Bundle datosObtenidos = intentObtenido.getExtras();

        imgVwDoc.setImageResource(datosObtenidos.getInt("imgDoc"));
        txtVwAsignatura.setText(datosObtenidos.getString("asignatura"));
        txtVwCreditos.setText(String.valueOf(datosObtenidos.getInt("creditos")));
        txtVwDocente.setText(datosObtenidos.getString("docente"));
    }
}