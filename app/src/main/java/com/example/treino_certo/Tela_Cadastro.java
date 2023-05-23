package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class Tela_Cadastro extends AppCompatActivity {

    CheckBox box;
    Switch swt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        box = findViewById(R.id.checkBox2);
        swt = findViewById(R.id.switch1);
    }

    public void Voltar(View v){
        Intent i = new Intent(this,Tela_login.class);
        startActivity(i);
    }

    public void Avancar(View v){
        if(box.isChecked()){
            if(swt.isChecked()){
                Intent personal = new Intent(this,Tela_HomeP.class);
                startActivity(personal);
            }else {
                Intent normal = new Intent(this,Tela_Home.class);
                startActivity(normal);
            }
        }else {
            Toast toast = Toast.makeText(this, "Termos não aceitos!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}