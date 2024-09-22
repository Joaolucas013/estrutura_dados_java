package org.example.teste.aula.aula;

import org.example.teste.aula.logica.pilha.Pilha;

public class Aula12 {
    public static void main(String[] args) {


        Pilha<Integer> pilha = new Pilha<>();
        for (int i = 0; i <10; i++) {
            pilha.empilha(i);

        }
        System.out.println(pilha.getTamanho());
        System.out.println(pilha);
    }
}
