package org.example.teste.aula.logica.fila;

public class Fila<T> {
    protected T[] elementos;
    protected int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // se o usuario não inserir a capacidade, inicia-se com tamanho 10
    public Fila() {
        this(10);
    }

    public boolean enfileira(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public T desenfileira() {
        if (this.estaVazia()) {
            return null;
        }
        final int POSICAO = 0;
        T elementoRemovido = this.elementos[POSICAO];

        for (int i = POSICAO; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];  // [5] = [6], [6] = [7]....
        }
        this.tamanho--;
        return elementoRemovido;

    }


    protected boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0)) {
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


    public boolean estaVazia() {
        // ou return this.tamanho==0;
        if(this.tamanho == 0) {
            return true;
        }
        return false;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho - 1; i++) {
                novosElementos[i] = this.elementos[i];
            }
            novosElementos = elementos;
        }

    }

    public T espiar() {

        if (estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }


    public int getTamanho() {
        return this.tamanho;
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
