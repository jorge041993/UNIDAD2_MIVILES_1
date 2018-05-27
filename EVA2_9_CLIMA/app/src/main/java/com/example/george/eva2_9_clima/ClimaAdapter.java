package com.example.george.eva2_9_clima;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class ClimaAdapter extends ArrayAdapter<DatosTemperatura> {

    Context cntxtContexto;
    int iLayout;
    DatosTemperatura[] datosClima;

    public ClimaAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull DatosTemperatura[] objects) {
        super(context, resource, objects);
        cntxtContexto = context;
        iLayout = resource;
        datosClima = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVwDet;
        TextView txtVwCiudadDet, txtVwTempDet, txtVwDescDet;
        View vwFila = convertView;

        if (vwFila == null) { //La lista se llena por primera vez
            LayoutInflater CrearLayout = ((Activity) cntxtContexto).getLayoutInflater();
            vwFila = CrearLayout.inflate(iLayout, parent, false);
        }

        imgVwDet = (ImageView) vwFila.findViewById(R.id.imgVw);
        txtVwCiudadDet = (TextView) vwFila.findViewById(R.id.txtVwCiudad);
        txtVwTempDet = (TextView) vwFila.findViewById(R.id.txtVwTemp);
        txtVwDescDet = (TextView) vwFila.findViewById(R.id.txtVwDesc);

        //Llenar datos
        imgVwDet.setImageResource(datosClima[position].imagenClima);
        txtVwCiudadDet.setText(datosClima[position].ciudad);
        txtVwTempDet.setText(datosClima[position].temperatura + "° C");
        txtVwDescDet.setText(datosClima[position].descripcion);
        return vwFila;
        //return super.getView(position, convertView, parent);
    }
}
