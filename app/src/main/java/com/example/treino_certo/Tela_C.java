package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_c);
    }

    public void Home(View view){
        Intent i = new Intent(this,Tela_Home.class);
        startActivity(i);
    }

    public void Notif(View view){
        Intent i = new Intent(this,Tela_Notifc.class);
        startActivity(i);
    }
    public void Perfil(View view){
        Intent i = new Intent(this,Tela_Perfil.class);
        startActivity(i);
    }
}