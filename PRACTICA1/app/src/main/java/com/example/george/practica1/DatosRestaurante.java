package com.example.george.practica1;

/**
 * Created by George on 10/04/2018.
 */

public class DatosRestaurante {
    int imagenResta;
    String nombreRest, telefono, descripcion, ubicacion;

    public DatosRestaurante() {
        imagenResta = R.drawable.confessional;
        nombreRest = "Confessional";
        telefono = "4195408";
        descripcion = "Plaza Rayuela";
        ubicacion = "Cantera #202";
    }

    public DatosRestaurante(int imagenResta, String nombreRest, String telefono, String descripcion, String ubicacion) {
        this.imagenResta = imagenResta;
        this.nombreRest = nombreRest;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

}