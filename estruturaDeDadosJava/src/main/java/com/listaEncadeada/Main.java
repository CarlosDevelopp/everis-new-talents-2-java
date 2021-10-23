package com.listaEncadeada;

public class Main {

    public static void main(String[] args){

        listaEncadeada<String> minhaListaEncadeada = new listaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");



        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(1);

        System.out.println((minhaListaEncadeada));
    }

}
