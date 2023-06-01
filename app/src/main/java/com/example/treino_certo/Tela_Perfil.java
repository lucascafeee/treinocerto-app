package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela_Perfil extends AppCompatActivity {

    boolean swt;
    TextView nome;
    ImageView ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);
        nome = findViewById(R.id.txt_nome);
        ft = findViewById(R.id.foto);
        swt = getIntent().getBooleanExtra("value",false);
    }

    public void Home(View view){
        if(swt){
            Intent ip = new Intent(this,Tela_HomeP.class);
            ip.putExtra("switchValue",swt);
            startActivity(ip);
        }else {
            Intent i = new Intent(this,Tela_Home.class);
            startActivity(i);
        }
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