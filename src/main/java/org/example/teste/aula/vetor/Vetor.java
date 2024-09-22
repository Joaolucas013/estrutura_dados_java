package org.example.teste.aula.vetor;

public class Vetor {
    public String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }


    public boolean adiciona(String elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adicionarAleatorio(int posicao, String elemento) {
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


    public void remover(int posicao) {
        if (!(posicao > 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao não Válida!!!");
        }
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao <= tamanho)) {
            throw new IllegalArgumentException("Posição inválida!!!");

        }
        return elementos[posicao];
    }

    // metodo retorna true se elemento existe,
    public boolean existeBoleano(String elemento) {
        for (int i = 0; i < this.tamanho - 1; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return true;

            }
        }
        return false;
    }

    // metodo retorna a posicao do elemento se ele existe
    public int existe(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }

        }
        return -1;
    }


    public void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            String[] novosElementos = new String[this.elementos.length * 2];

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
        for (int i = 0; i < this.

                tamanho - 1; i++) {
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
