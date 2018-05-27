package com.itchii.mario.eva2_9_custom_adapter;

/**
 * Created by Mario on 19/10/2017.
 */

public class DatosTemperatura {
    int imagenClima;
    String ciudad;
    int temperatura;
    String descripcion;

    public  DatosTemperatura() {
        imagenClima = R.drawable.sunny;
        ciudad = "Chihuahua";
        temperatura = 1000;
        descripcion = "Soleado";
    }

    public DatosTemperatura(int imgClima, String iCiudad, int iTemperatura, String iDscripcion) {
        imagenClima = imgClima;
        ciudad = iCiudad;
        temperatura = iTemperatura;
        descripcion = iDscripcion;
    }
}
