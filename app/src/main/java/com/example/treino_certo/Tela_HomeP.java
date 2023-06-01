package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tela_HomeP extends AppCompatActivity {

    boolean swt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home_p);
        swt = getIntent().getBooleanExtra("switchValue", false);
        System.out.println(swt + "fre");
    }

    public void Home(View view){
        if(swt){
            Intent i = new Intent(this,Tela_HomeP.class);
            startActivity(i);
        }else {
            Intent i = new Intent(this,Tela_Home.class);
            startActivity(i);
        }
    }
    public void Notif(View view){
        Intent i = new Intent(this,Tela_Notifc.class);
        startActivity(i);
    }
    public void Perfil(View view){
        Intent i = new Intent(this,Tela_Perfil.class);
        i.putExtra("value",swt);
        startActivity(i);
    }
}