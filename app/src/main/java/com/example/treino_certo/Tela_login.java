package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Tela_login extends AppCompatActivity {

    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        editTextEmail = findViewById(R.id.edit_email);
        editTextPassword = findViewById(R.id.edit_senha);
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
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if(email.isEmpty() || password.isEmpty()) {
            Toast toast = Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Intent iE = new Intent(this,Tela_Home.class);
            startActivity(iE);
        }
    }
}
