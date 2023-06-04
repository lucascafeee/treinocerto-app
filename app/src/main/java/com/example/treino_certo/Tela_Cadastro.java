package com.example.treino_certo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class Tela_Cadastro extends AppCompatActivity {

    EditText editTextName, editTextCPF, editTextBirthDate, editTextPhone, editTextEmail, editTextPassword;
    CheckBox box;
    Switch swt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        editTextName = findViewById(R.id.editTextTextPersonName);
        editTextCPF = findViewById(R.id.editTextTextPersonName2);
        editTextBirthDate = findViewById(R.id.editTextDate);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        box = findViewById(R.id.checkBox2);
        swt = findViewById(R.id.switch1);
    }

    public void Voltar(View v){
        Intent i = new Intent(this,Tela_login.class);
        startActivity(i);
    }

    public void Avancar(View v){
        String name = editTextName.getText().toString();
        String cpf = editTextCPF.getText().toString();
        String birthDate = editTextBirthDate.getText().toString();
        String phone = editTextPhone.getText().toString();
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
        boolean isPersonal = swt.isChecked();
        boolean acceptedTerms = box.isChecked();

        if(name.isEmpty() || cpf.isEmpty() || birthDate.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast toast = Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT);
            toast.show();
        } else if (!acceptedTerms) {
            Toast toast = Toast.makeText(this, "Termos não aceitos!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            if (isPersonal) {
                Intent personal = new Intent(this, Tela_HomeP.class);
                personal.putExtra("userName", name);
                personal.putExtra("switchValue", isPersonal);
                startActivity(personal);
            } else {
                Intent normal = new Intent(this, Tela_Home.class);
                normal.putExtra("userName", name);
                normal.putExtra("switchValue", isPersonal);
                startActivity(normal);
            }
        }
    }
}

