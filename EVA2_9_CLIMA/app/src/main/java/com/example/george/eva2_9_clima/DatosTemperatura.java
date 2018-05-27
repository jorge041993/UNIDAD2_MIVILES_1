package com.example.george.eva2_9_clima;


public class DatosTemperatura {
    int imagenClima;
    String ciudad;
    int temperatura;
    String descripcion;

    public  DatosTemperatura() {
        imagenClima = R.drawable.sunny;
        ciudad = "Santa Barbara";
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
