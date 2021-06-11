package com.example.aula1504;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {
    TextView  nome, sobrenome;
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        nome = findViewById(R.id.textViewNome);
        sobrenome = findViewById(R.id.textViewSobrenome);
        btnVoltar = findViewById(R.id.buttonVoltar);
        //Recupera  os  dados enviados
        Intent correio =getIntent();

        //Criando o pacote do correio pra receber o envelope
        Bundle envelope = correio.getExtras();

        nome.setText(envelope.getString("nome"));
        sobrenome.setText(envelope.getString("sobrenome"));

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fecha a view  atual
                finish();
            }
        });
    }
}
