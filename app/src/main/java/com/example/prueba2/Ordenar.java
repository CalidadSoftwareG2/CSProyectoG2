package com.example.prueba2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Ordenar extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Sistema s = null;
        s = Sistema.getSistema();
    }
}
