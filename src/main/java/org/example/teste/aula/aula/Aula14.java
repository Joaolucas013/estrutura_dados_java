package org.example.teste.aula.aula;

import org.example.teste.aula.logica.pilha.Pilha;

public class Aula14 {
    public static void main(String[] args) {


        Pilha<Integer> pilha = new Pilha<>();


            pilha.empilha(1);
            pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);


        System.out.println(pilha.topo());
        System.out.println(pilha.desempilha());
        System.out.println(pilha.topo());
    }
}