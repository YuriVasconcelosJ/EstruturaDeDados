package br.com.structuredata.colecoes;

import java.util.HashMap;

import br.com.structuredata.model.Produto;

public class HashMapTest {
    
    private static final int TAMANHO = 100000;

    public static void main(String[] args) {
        
        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        for (int i = 0; i <= TAMANHO; i++) {
            mapa.put(i, new Produto(i, "Produto" + i, i * 20.00));
        } 

        long startTime = System.currentTimeMillis();

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = mapa.get(qtd);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime - startTime));


    }
}
