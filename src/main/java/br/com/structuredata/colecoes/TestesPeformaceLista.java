package br.com.structuredata.colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestesPeformaceLista {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            linkedList.add(1);
        }

        long inicioArry = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            arrayList.get(i * 100 );
        }
        long fimArry = System.currentTimeMillis();
        
        System.out.println("Tempo de execução: " + (fimArry - inicioArry));
    
        long inicioLinked = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            linkedList.get(i * 100 );
        }
        long fimLinked = System.currentTimeMillis();
       
        System.out.println("Tempo de execução: " + (fimLinked - inicioLinked));

        
    }
    
}
