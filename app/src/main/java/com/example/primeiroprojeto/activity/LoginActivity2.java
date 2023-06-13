package com.example.primeiroprojeto.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.primeiroprojeto.R;

public class LoginActivity2 extends AppCompatActivity {

    private EditText editNome, editSenha;
    private Button botaoAcessar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicializarComponentes();

        botaoAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeUsuario = editNome.getText().toString();
                String senhaUsuario = editSenha.getText().toString();

                if (!nomeUsuario.isEmpty() && !senhaUsuario.isEmpty()) {
                    if (!senhaUsuario.isEmpty())
                        textResultado.setText("Nome do usuário: " + nomeUsuario + "\nSenha do usuário: " + senhaUsuario);
                    else {
                        editSenha.setError("Preecha o campo senha");
                    }
                }else {
                    editNome.setError("Preecha o campo nome");
                }
            }
        });
    }

    public void inicializarComponentes() {
        editNome = findViewById(R.id.editNome);
        editSenha = findViewById(R.id.editSenha);
        botaoAcessar = findViewById(R.id.buttomAcessar);
        textResultado = findViewById(R.id.textResultado);
    }
}