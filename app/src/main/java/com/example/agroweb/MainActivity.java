package com.example.agroweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button agro, restaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void agroTela(View view){
        Intent i = new Intent(this, AgricultorLogin.class);
        startActivity(i);
    }

    public void resTela(View view){
        Intent i = new Intent(this, RestauranteLogin.class);
        startActivity(i);
    }


}