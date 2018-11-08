package com.example.marlonraphael.recyclerview01;

import java.util.ArrayList;

public class ContatoLista
{
    private static ArrayList<Contato> listaContatos = new ArrayList<>();

    public static void add(Contato contato)
    {
        listaContatos.add(contato);
    }

    public static Contato getContato(int index) { return listaContatos.get(index); }

    public static ArrayList<Contato> getLista() { return listaContatos; }

    public static void gerarLista()
    {
        listaContatos.add(new Contato("Marlon", "9 9175-6758", "marlon.raphaael@hotmail.com", "ROD BR 116, 17844"));
        listaContatos.add(new Contato("Wagner", "9 9889-5758", "wagner_amaral@terra.com.br", "All Street, 1045"));
        listaContatos.add(new Contato("Maria", "9 9657-8689", "Spazio Carmenere", "marie_guns@hotmail.com"));
        listaContatos.add(new Contato("Fernanda", "9 9867-8208", "Aparecida Feliciano", "fernandafmc@gmail.com"));
        listaContatos.add(new Contato("João", "9 9887-7767", "Jornalista S. A. Batista", "joaozinho@gmail.com"));
    }
}