package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.pilha.Pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<PilhaExercicio> stack = new Stack<>();
       Pilha<PilhaExercicio> pilha = new Pilha<>(6);
       PilhaExercicio p1 = new PilhaExercicio("joso", "33", "222", "33");


       pilha.empilha(p1);
       stack.push(p1);
       System.out.println(stack.empty());
        System.out.println(p1);



    }
}
