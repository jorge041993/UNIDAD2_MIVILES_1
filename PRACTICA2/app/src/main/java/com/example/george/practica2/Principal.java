package com.example.george.practica2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lstVwPrincipal;
    Context contexto;

    String[] listaMateria = {
            //Progra
            "Fundamentos de programación", "Matemáticas Discretas", "Programación Orientada a Objetos",
            "Estructura de Datos", "Tópicos Avanzados de Programación", "Graficación", "Programación Web",
            //Redes
            "Fundamentos de Telecomunicaciones", "Redes de Computadoras", "Taller de Sistemas Operativos",
            "Conmutación y Enrutamiento en Redes de Datos", "Administración de Redes",
            //BD
            "Fundamentos de Bases de Datos", "Taller de Bases de Datos", "Administración de Bases de Datos"
    };

    int[] creditosMateria = {
            //Progra
            5, 5, 5, 5, 5, 5, 5,
            //Redes
            4, 5, 4, 4, 4,
            //BD
            5, 4, 4
    };

    String[] docentesMateria = {
            "Juan", "Pepe", "Paco", "Luis", "Arturo", "Ruben", "Jaime", "Raul", "Pedro",
            "Beto", "Miguel", "Pancho", "Jose", "Adrian", "Pancho"
    };

    DatosAsig[] arrayAsignaturas = {
            new DatosAsig(R.drawable., listaMateria[0], creditosMateria[0], docentesMateria[0], R.drawable.profe1),
            new DatosAsig(R.drawable.programacion, listaMateria[1], creditosMateria[1], docentesMateria[1], R.drawable.profe2),
            new DatosAsig(R.drawable.programacion, listaMateria[2], creditosMateria[2], docentesMateria[2], R.drawable.profe3),
            new DatosAsig(R.drawable.programacion, listaMateria[3], creditosMateria[3], docentesMateria[3], R.drawable.profe4),
            new DatosAsig(R.drawable.programacion, listaMateria[4], creditosMateria[4], docentesMateria[4], R.drawable.profe5),
            new DatosAsig(R.drawable.programacion, listaMateria[5], creditosMateria[5], docentesMateria[5], R.drawable.profe6),
            new DatosAsig(R.drawable.programacion, listaMateria[6], creditosMateria[6], docentesMateria[6], R.drawable.profe1),
            new DatosAsig(R.drawable.redes, listaMateria[7], creditosMateria[7], docentesMateria[7], R.drawable.profe2),
            new DatosAsig(R.drawable.redes, listaMateria[8], creditosMateria[8], docentesMateria[8], R.drawable.profe3),
            new DatosAsig(R.drawable.redes, listaMateria[9], creditosMateria[9], docentesMateria[9], R.drawable.profe4),
            new DatosAsig(R.drawable.redes, listaMateria[10], creditosMateria[10], docentesMateria[10], R.drawable.profe5),
            new DatosAsig(R.drawable.redes, listaMateria[11], creditosMateria[11], docentesMateria[11], R.drawable.profe6),
            new DatosAsig(R.drawable.bases, listaMateria[12], creditosMateria[12], docentesMateria[12], R.drawable.profe1),
            new DatosAsig(R.drawable.bases, listaMateria[13], creditosMateria[13], docentesMateria[13], R.drawable.profe2),
            new DatosAsig(R.drawable.bases, listaMateria[14], creditosMateria[14], docentesMateria[14], R.drawable.profe3)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwPrincipal = (ListView) findViewById(R.id.lstVwPrincipal);
        lstVwPrincipal.setAdapter(new ListaAdap(this, R.layout.lista, arrayAsignaturas));
        contexto = getApplicationContext();
        lstVwPrincipal.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent enviarDatos = new Intent(this, DetallesAsig.class);
        Bundle bundleDatos = new Bundle();
        bundleDatos.putInt("imgDoc", arrayAsignaturas[i].imagenDocente);
        bundleDatos.putString("asignatura", arrayAsignaturas[i].nombreAsignatura);
        bundleDatos.putInt("creditos", arrayAsignaturas[i].creditosAsignatura);
        bundleDatos.putString("docente", arrayAsignaturas[i].docenteAsignatura);
        enviarDatos.putExtras(bundleDatos);
        startActivity(enviarDatos);
    }
    }


