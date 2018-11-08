package com.example.marlonraphael.recyclerview01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class ContatoAdapter extends RecyclerView.Adapter
{

    private ArrayList<Contato> listaContatos;
    private Context context;

    public ContatoAdapter(ArrayList<Contato> listaContatos, Context context)
    {
        this.listaContatos = listaContatos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.celula_contato, viewGroup, false);

        ContatoHolder holder = new ContatoHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i)
    {
        ContatoHolder contatoHolder = (ContatoHolder)viewHolder;
        contatoHolder.txtNomeCell.setText(listaContatos.get(i).getNome());
        contatoHolder.txtFoneCell.setText(listaContatos.get(i).getFone());

        contatoHolder.txtNomeCell.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                Toast.makeText(context, "Nome: " + i, Toast.LENGTH_SHORT).show();

                Contato contato = ContatoLista.getContato(i);

                Bundle detalhes = new Bundle();
                detalhes.putString("nome", contato.getNome());
                detalhes.putString("fone", contato.getFone());
                detalhes.putString("email", contato.getEmail());
                detalhes.putString("endereco", contato.getEndereco());

                Intent intent = new Intent(context, DetalhesActivity.class);

                intent.putExtras(detalhes);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return this.listaContatos.size();
    }
}
