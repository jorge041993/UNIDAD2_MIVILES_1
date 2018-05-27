package com.example.george.practica1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class restaurante_detalle extends AppCompatActivity {

    ImageView imgVwDet;
    TextView txtNombre, txtDescripcion, txtTel, txtUbicacion;
    String tel="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_detalle);

        imgVwDet = (ImageView) findViewById(R.id.imgVwDet);
        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);
        txtTel = (TextView) findViewById(R.id.txtTel);
        txtUbicacion = (TextView) findViewById(R.id.txtUbicacion);

        //Recuperar el intento que genero detalle
        Intent datos = getIntent();
        //Acceder al bundle
        Bundle bundleDatos = datos.getExtras();
        //Leer los datos
        imgVwDet.setImageResource(bundleDatos.getInt("imagen"));
        txtNombre.setText(bundleDatos.getString("nombreRest"));
        txtDescripcion.setText(bundleDatos.getString("descripcion"));
        txtTel.setText("Telefono: "+bundleDatos.getString("telefono"));
        txtUbicacion.setText(bundleDatos.getString("ubicacion"));
        tel = bundleDatos.getString("telefono");
    }

    public void enClick(View view) {
        finish();
    }

    @SuppressLint("MissingPermission")
    public void clickTelefono(View v) {
        String uriTel = "tel:"+tel;
        Intent llamadaDirecta = new Intent(Intent.ACTION_CALL, Uri.parse(uriTel));
        startActivity(llamadaDirecta);
    }
}
