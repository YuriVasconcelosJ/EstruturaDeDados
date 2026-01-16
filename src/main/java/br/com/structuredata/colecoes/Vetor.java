package br.com.structuredata.colecoes;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(final int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0; 
    }

    public boolean adicionar(final String elemento) {
        aumentaCapacidade();

        if(tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    private void aumentaCapacidade() {
        if(tamanho == elementos.length) {
            String[] novoElementos = new String[tamanho * 2];

            for(int i = 0; i < elementos.length; i++) {
                novoElementos[i] = elementos[i];
            }
            elementos = novoElementos;
        }
    }
    
    
}
