package com.example.agroweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgricultorLogin extends AppCompatActivity {
    EditText crmv, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agricultor_login);
        getSupportActionBar().hide();
        crmv = findViewById(R.id.crmvLogin);
        senha = findViewById(R.id.senhaAgro);

    }

    public void cadastrarTela(View view){
        Intent i = new Intent(this, AgricultorRegister.class);
        startActivity(i);
    }
}