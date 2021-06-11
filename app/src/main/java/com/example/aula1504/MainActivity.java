package com.example.aula1504;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declarando variaveis
    EditText nome,sobrenome;
    Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ligando as variaveis aos elementos da view
        nome = findViewById(R.id.editTextNome);
        sobrenome = findViewById(R.id.editTextSobrenome);
        btnOk = findViewById(R.id.buttonOk);

        //Programa o evento do botao ok
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNome = nome.getText().toString();
                String txtSobrenome = sobrenome.getText().toString();
                //Preparando para enviar para a segunda tela
                //Criando um ambiente para enviar os dados
                Intent correio = new Intent(getApplicationContext(),Resultado.class);

                //Criando envelope
                Bundle envelope = new Bundle();

                //Colocando dados dentro do envelope
                envelope.putString("nome",txtNome);
                envelope.putString("sobrenome",txtSobrenome);

                //Colocando o envelope no correio
                correio.putExtras(envelope);

                //Transportando a correspondencia
                startActivity(correio);

                //Testando pra  ver se esta tudo OK
                //Toast.makeText(MainActivity.this, txtNome + " " + txtSobrenome, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
