package com.example.george.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView txtDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtDatos= (TextView)findViewById(R.id.txtDatos);
        //recuperar intento
        Intent inDatos = getIntent();
        //acceder al bundle, ller datos
        Bundle bnDatos = inDatos.getExtras();
        //del bundle, leer datos
        txtDatos.append("NOMBRE: " + bnDatos.getString("NOMBRE") + "\n");
        txtDatos.append("APELLIDO: " + bnDatos.getString("APELLIDO") + "\n");
        txtDatos.append("SALARIO: " + bnDatos.getDouble("SALARIO") + "\n");
        switch (bnDatos.getInt("GENERO")){
            case 0:
                txtDatos.append("GENERO: MASCULINO \n");
                break;
            case  1:
                txtDatos.append("GENERO: FEMENINO \n");
                break;
            case  2:
                txtDatos.append("GENERO: NO ESPECIFICO \n");
                break;

        }
    }
}

