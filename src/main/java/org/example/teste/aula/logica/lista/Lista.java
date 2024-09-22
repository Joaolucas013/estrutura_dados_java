package org.example.teste.aula.logica.lista;

public class Lista <T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista() {
        this(10);
    }

    public boolean adiciona(T elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionarAleatorio(int posicao, T elemento) {
        aumentaCapacidade();
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posicao invalida!!!");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            // 6 passa para posicao 7, 5 passa para 6..
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remover(T elemento) {
        int elementoRemovido = busca(elemento);
        if (elementoRemovido > -1) {
            for (int i = elementoRemovido; i <= tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];

            }
            tamanho--;
        }

    }

    public T obtem(int posicao) {

        if (!(posicao >= -1 && posicao < tamanho)) {
            throw new IllegalArgumentException("ERRO!");
        }
        return elementos[posicao];
    }


    public int ultimaPosicao(T elemento) {

        for (int i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void limpaTodos() {
        for (int i = this.tamanho - 1; i > 0; i--) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }


    public void remover(int posicao) {
        if (!(posicao > 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao não Válida!!!");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }

    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida!!!");
        }
        return elementos[posicao];
    }

    public Boolean contem(T elemento) {
        int posicao = busca(elemento);
        if (posicao > -1) {
            return true;
        }
        return false;
    }


    // metodo retorna true se elemento existe,
    public boolean existeBoleano(T elemento) {

        for (int i = 0; i < this.tamanho - 1; i++) {
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // metodo retorna a posicao do elemento se ele existe
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }

        }
        return -1;
    }


    public void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    public int tamanho() {
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
