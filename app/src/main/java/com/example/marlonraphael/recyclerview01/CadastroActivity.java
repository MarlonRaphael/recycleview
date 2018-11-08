package com.example.marlonraphael.recyclerview01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity
{

    private EditText inputNome;
    private EditText inputFone;
    private EditText inputEmail;
    private EditText inputEndereco;
    private Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        inputNome = findViewById(R.id.inputNome);
        inputFone = findViewById(R.id.inputFone);
        inputEmail = findViewById(R.id.inputEmail);
        inputEndereco = findViewById(R.id.inputEndereco);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (
                        inputNome.getText().toString().isEmpty() ||
                        inputFone.getText().toString().isEmpty() ||
                        inputEmail.getText().toString().isEmpty() ||
                        inputEndereco.getText().toString().isEmpty()
                    )
                {
                    Toast.makeText(CadastroActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else {
                    String nome = inputNome.getText().toString();
                    String fone = inputFone.getText().toString();
                    String email = inputEmail.getText().toString();
                    String endereco = inputEndereco.getText().toString();

                    Contato contato = new Contato(nome, fone, email, endereco);

                    ContatoLista.add(contato);

                    Toast.makeText(CadastroActivity.this, "Contato adicionado com sucesso", Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(CadastroActivity.this, MainActivity.class));
                }
            }
        });
    }
}
