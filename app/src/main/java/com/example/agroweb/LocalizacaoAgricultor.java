package com.example.agroweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class LocalizacaoAgricultor extends AppCompatActivity {
    MapView mapView;
    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao_agricultor);
        //pedir permissao
        mapView = (MapView) this.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync((OnMapReadyCallback) this);

    }
}