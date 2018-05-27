package com.example.george.practica1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView lstVwLista;
    Context contexto;

    DatosRestaurante[] arregloRestaurantes = {
            new DatosRestaurante(R.drawable.confessional, "Confessional", "Plaza Rayuela", "4195408", "Cantera #202"),
            new DatosRestaurante(R.drawable.bourkestreetbakery, "Bourke Street Bakery", " Plaza Cantera V", "4895347", "Cantera #52"),
            new DatosRestaurante(R.drawable.cafedeadend, "Cafe Dead End", "Plaza Galerias", "4879621", "Ortiz mena #521"),
            new DatosRestaurante(R.drawable.cafeloisl, "Cafe Loisl", "Plaza vallarta", "4782314", "Vallarta #401"),
            new DatosRestaurante(R.drawable.cafelore, "Cafe Lore", "Plaza plazita", "4781235", "Arboledas #520"),
            new DatosRestaurante(R.drawable.barrafina, "Barrafina", "Distrito 1", "4569821", "Periferico juventud #312"),
            new DatosRestaurante(R.drawable.donostia, "Don Ostia", "Fashion mall", "4561238", "Periferico jueventud #584"),
            new DatosRestaurante(R.drawable.fiveleaves, "Five Leaves", "Distrito 1", "4789562", "Periferico juventud #312"),
            new DatosRestaurante(R.drawable.forkeerestaurant, "Forkee Restaurant", "Por mi casa", "8547566", "Catalpa #854"),
            new DatosRestaurante(R.drawable.grahamavenuemeats, "Graham Avenue Meats", "Plaza Galerias", "4718529", "Tecnologico #584"),
            new DatosRestaurante(R.drawable.haighschocolate, "Haighs Chocolate", "Plaza Galerias", "4369871", "Americas #847"),
            new DatosRestaurante(R.drawable.homei, "Homei", "Plaza Galerias", "4123698", "Zaragoza #574"),
            new DatosRestaurante(R.drawable.palominoespresso, "Palomino Espresso", "Plaza Galerias", "4567891", "Pino #126"),
            new DatosRestaurante(R.drawable.petiteoyster, "Petite Oyster", "Fashion mall", "4567891", "Cusihuiriachi #15509"),
            new DatosRestaurante(R.drawable.posatelier, "Posatelier", "Fashion mall", "4567891", "Sicomoro #541"),
            new DatosRestaurante(R.drawable.royaloak, "Royal Oak", "Plaza Rayuela", "4567891", "Cantera #254"),
            new DatosRestaurante(R.drawable.teakha, "Tea Kha", "Plaza Rayuela", "4325478", "Ahuehuete #741"),
            new DatosRestaurante(R.drawable.thaicafe, "Thai Cafe", "Plaza Rayuela", "4325478", "Pacheco #654"),
            new DatosRestaurante(R.drawable.traif, "Traif", "Plaza vallarta", "4325478", "Gonzalez Cossio #5715"),
            new DatosRestaurante(R.drawable.upstate, "Up Sate", "Plaza vallarta", "4325478", "Tecnologico #498"),
            new DatosRestaurante(R.drawable.wafflewolf,"Waffle Wolf", "Plaza vallarta", "4325478", "Vallarta #666")

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwLista = (ListView) findViewById(R.id.lstVwLista);
        lstVwLista.setAdapter(new RestauranteAdapter(this, R.layout.resta_layout, arregloRestaurantes));
        lstVwLista.setOnItemClickListener(this);
        contexto = getApplicationContext();
    }

    @Override
    public void onItemClick(AdapterView<?>  parent, View view, int position, long id) {
        Intent mostrarDet = new Intent(Principal.this, restaurante_detalle.class);
        Bundle bundleDatos = new Bundle();
        bundleDatos.putInt("imagen", arregloRestaurantes[position].imagenResta);
        bundleDatos.putString("nombreRest", arregloRestaurantes[position].nombreRest);
        bundleDatos.putString("telefono", arregloRestaurantes[position].telefono);
        bundleDatos.putString("descripcion", arregloRestaurantes[position].descripcion);
        bundleDatos.putString("ubicacion", arregloRestaurantes[position].ubicacion);
        mostrarDet.putExtras(bundleDatos);
        startActivity(mostrarDet);
    }
}
