package br.com.structuredata.arvore;

public class Arvore {
    
    private Folha folha;
    private Arvore arvoreEsquerda;
    private Arvore arvoreDireita;

    public Arvore() {
        this.folha = null;
        this.arvoreEsquerda = null;
        this.arvoreDireita = null;
    }
    
    public Arvore(Folha folha) {
        this.folha = folha;
        this.arvoreEsquerda = null;
        this.arvoreDireita = null;
    }

    public Folha getFolha() {
        return folha;
    }

    public void setFolha(Folha folha) {
        this.folha = folha;
    }
    
    public Arvore getArvoreEsquerda() {
        return arvoreEsquerda;
    }
    
    public void setArvoreEsquerda(Arvore arvoreEsquerda) {
        this.arvoreEsquerda = arvoreEsquerda;
    }
    
    public Arvore getArvoreDireita() {
        return arvoreDireita;
    }
    
    public void setArvoreDireita(Arvore arvoreDireita) {
        this.arvoreDireita = arvoreDireita;
    }

    public boolean isEmpty() {
        return this.folha == null;
    }

    public void inserir(Folha novo) {
        if(isEmpty()) {
            this.folha = novo;
        } else {
            Arvore novaArvore = new Arvore(novo);
            if (novo.getValue() < this.folha.getValue()) {
                if(this.arvoreEsquerda == null) {
                    this.arvoreEsquerda = novaArvore;
                } else {
                    this.arvoreEsquerda.inserir(novo);
                }
            } else if(novo.getValue() > this.folha.getValue()) {
                if(this.arvoreDireita == null) {
                    this.arvoreDireita = novaArvore;
                } else {
                    this.arvoreDireita.inserir(novo);
                }

            }
        }
    }
}
