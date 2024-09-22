package org.example.teste.aula.logica.fila;

import java.util.Arrays;

public class FilaPrioridade <T> extends Fila<T>{


    public void enfileirar(T elemento) {

        Comparable<T> chave = (Comparable<T>) elemento;

        int i = 0;
        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
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
