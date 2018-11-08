package com.example.marlonraphael.recyclerview01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button btnAddContato;
    RecyclerView rclContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddContato = findViewById(R.id.btnAddContato);
        rclContatos = findViewById(R.id.rclContatos);

        if (ContatoLista.getLista().isEmpty())
        {
            ContatoLista.gerarLista();
        }

        ContatoAdapter contatoAdapter = new ContatoAdapter(ContatoLista.getLista(), MainActivity.this);

        rclContatos.setAdapter(contatoAdapter);

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager
            (
                MainActivity.this,
                LinearLayoutManager.VERTICAL,
                false
            );

        rclContatos.setLayoutManager(meuLayout);

        btnAddContato.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });

    }
}