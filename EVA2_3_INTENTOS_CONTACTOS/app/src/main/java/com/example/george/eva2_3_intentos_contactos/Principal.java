package com.example.george.eva2_3_intentos_contactos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    Intent inMostrarContacto;
    Intent inBuscarGoogle;
    Intent inVerIma;
    EditText busqueda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        String sQuesBuscmos = "content://contacts/people/";
        inMostrarContacto = new Intent(Intent.ACTION_VIEW, Uri.parse(sQuesBuscmos));
        inVerIma =new Intent(Intent.ACTION_GET_CONTENT);
        inVerIma.setType("image/pictures/*");

    }
    public void clickCont(View v){
       startActivity(inMostrarContacto);
    }
    public void clickBusqueda(View v){
        String sBus = busqueda.getText().toString();
        inBuscarGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
        inBuscarGoogle.putExtra(SearchManager.QUERY, sBus);
        startActivity(inBuscarGoogle);
    }
    public  void  clickImagenes(View v){
      startActivity(inVerIma);
    }
}
