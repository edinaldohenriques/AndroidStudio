package com.example.primeiroprojeto.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.primeiroprojeto.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonNovaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNovaTela = findViewById(R.id.buttonAcessarNovaTela);
        buttonNovaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity2.class));
            }
        });
    }
}