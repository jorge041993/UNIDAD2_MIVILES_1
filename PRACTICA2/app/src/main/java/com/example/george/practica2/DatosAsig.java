package com.example.george.practica2;

/**
 * Created by George on 23/04/2018.
 */

public class DatosAsig {
    int imagenAsignatura, creditosAsignatura, imagenDocente;
    String nombreAsignatura, docenteAsignatura;

    public void DatosAsig(){
        imagenAsignatura = R.drawable.bases;
        nombreAsignatura = "Fundamentos de Bases de Datos";
        creditosAsignatura = 5;
        docenteAsignatura = "Alguien";
        imagenDocente = R.drawable.profe2;
    }


    public DatosAsig(int imagen, String nombre, int creditos, String docente, int imgDocente) {
        imagenAsignatura = imagen;
        nombreAsignatura = nombre;
        creditosAsignatura = creditos;
        docenteAsignatura = docente;
        imagenDocente = imgDocente;
    }
}
