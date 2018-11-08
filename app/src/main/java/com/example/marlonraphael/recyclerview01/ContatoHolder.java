package com.example.marlonraphael.recyclerview01;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ContatoHolder extends RecyclerView.ViewHolder
{

    public TextView txtNomeCell;
    public TextView txtFoneCell;

    public ContatoHolder(@NonNull View itemView)
    {
        super(itemView);
        txtNomeCell = itemView.findViewById(R.id.txtNomeCell);
        txtFoneCell = itemView.findViewById(R.id.txtFoneCell);
    }
}