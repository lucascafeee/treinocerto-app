package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);
    }

    public void Home(View view){
        Intent i = new Intent(this,Tela_Home.class);
        startActivity(i);
    }

    public void Sair(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void Priv(View view){
        Intent i = new Intent(this,Tela_Priv.class);
        startActivity(i);
    }
}