package com.moviles.invictus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText txtCod,txtPas;
    Button btnIngresar,btnLimpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtCod = (EditText) findViewById(R.id.txtCod);
        txtPas = (EditText) findViewById(R.id.txtPas);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Ingresando a Invictus",Toast.LENGTH_SHORT).show();
            }
        });

        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCod.setText("");
                txtPas.setText("");
            }
        });

    }




}
