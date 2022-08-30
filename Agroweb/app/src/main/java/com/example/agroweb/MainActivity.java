package com.example.agroweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText CRMV,senha,campoConfirmarSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CRMV=findViewById(R.id.campoCRMV);
        campoConfirmarSenha= findViewById(R.id.campoConfirmarSenha);
        senha=findViewById(R.id.campoConfirmarSenha);
    }

    public EditText getCRMV() {
        return CRMV;
    }

    public void setCRMV(EditText CRMV) {
        this.CRMV = CRMV;
    }

    public EditText getSenha() {
        return senha;
    }

    public void setSenha(EditText senha) {
        this.senha = senha;
    }

    public EditText getCampoConfirmarSenha() {
        return campoConfirmarSenha;
    }


    public static class Restaurante {
        public
    }
}