package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
    }

    public void Voltar(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void Cadastrar(View v){
        Intent ic = new Intent(this,Tela_Cadastro.class);
        startActivity(ic);
    }

    public void Entrar(View v){
        Intent iE = new Intent(this,Tela_Home.class);
    }

}