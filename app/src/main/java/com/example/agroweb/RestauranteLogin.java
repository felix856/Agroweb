package com.example.agroweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RestauranteLogin extends AppCompatActivity {

    EditText cnpj, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_login);
        getSupportActionBar().hide();
        cnpj = findViewById(R.id.cnpjLogin);
        senha = findViewById(R.id.senhaRegister);
    }

    public void trocaTela(View v){
        Intent i = new Intent(this, RestauranteRegister.class);
        startActivity(i);
    }
}