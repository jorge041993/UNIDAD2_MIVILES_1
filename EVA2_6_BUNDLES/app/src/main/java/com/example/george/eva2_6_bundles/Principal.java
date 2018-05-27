package com.example.george.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Principal extends AppCompatActivity {
    EditText edtxtnom, edtxtape,edtxtsal;
    RadioButton rdbtnmas, rdbtnfem, rdbtnno;
    CheckBox chbxsol;
    Button btnEnviar;
    Intent inEnviarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxtnom=(EditText)findViewById(R.id.edtxtnom);
        edtxtape=(EditText)findViewById(R.id.edtxtape);
        edtxtsal=(EditText)findViewById(R.id.edtxtsal);

        rdbtnmas=(RadioButton) findViewById(R.id.rbtnmas);
        rdbtnfem=(RadioButton)findViewById(R.id.rbtnfem);
        rdbtnno=(RadioButton)findViewById(R.id.rdbtnno);

        chbxsol=(CheckBox)findViewById(R.id.chbxsol);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);

        //CREAR INTENTO
        inEnviarDatos = new Intent(this,Secundaria.class);


    }

    public void onClickEnviar (View v){
        String sNom, sApe;
        double dSal;
        int iSex = -1;
        boolean bSoltero;

        sNom = edtxtnom.getText().toString();
        sApe=edtxtape.getText().toString();
        dSal= Double.parseDouble(edtxtsal.getText().toString());
        if(rdbtnmas.isChecked())
            iSex = 0;
        else if (rdbtnfem.isChecked())
            iSex = 1;
        else  if (rdbtnno.isChecked())
            iSex = 2;

        bSoltero = chbxsol.isChecked();

        Bundle bnDatos= new Bundle();
        bnDatos.putString("NOMBRE", sNom);
        bnDatos.putString("APELLIDO", sApe);
        bnDatos.putDouble("SALARIO", dSal);
        bnDatos.putInt("GENERO", iSex);
        bnDatos.putBoolean("SOLTERO", bSoltero);
        inEnviarDatos.putExtras(bnDatos);
        startActivity(inEnviarDatos);

    }
}

