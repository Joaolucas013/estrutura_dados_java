package org.example.teste.aula.aula;

import org.example.teste.aula.logica.pilha.Pilha;

public class Aula13 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        System.out.println(pilha.estaVazia());
      pilha.empilha(1);
             System.out.println(pilha.estaVazia());

    }
}
