package br.com.structuredata;

import br.com.structuredata.colecoes.Vetor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
            Vetor nome = new Vetor(5);
            nome.adicionar("Yuri");
            nome.adicionar("Amanda");
            nome.adicionar("Alicia");

    }
}