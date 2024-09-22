package org.example.teste.aula.logica.pilha;

public class PilhaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public PilhaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public PilhaEstatica() {
        this(10);
    }

    public int getTamanho() {
        return this.tamanho;
    }

   protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novosElementos[i] = this.elementos[i];
            }
            novosElementos = elementos;
        }
    }



    protected boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }


    protected boolean adiciona(int posicao, T elemento) {
        aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida!!!");
        }
        // 6 passa para posicao 7, 5 passa para 6..
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    protected void remover(int posicao){
        if(!(posicao>0 && posicao<this.tamanho)){
            throw  new IllegalArgumentException("Posicao não Válida!!!");
        }
        for (int i = this.tamanho-1; i>=posicao ; i--) {
            this.elementos[i] = elementos[i+1];
        }
        this.tamanho--;
    }



    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

}