package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.pilha.Pilha;

import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {

        Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaimpar = new Pilha<>();
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();


        for (int i = 0; i < 10; i++) {
            System.out.println("digite um numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                System.out.println("empilhando elemento par");
                pilhaPar.empilha(numero);
            } else {
                System.out.println("empilhando elemento impar");
                pilhaimpar.empilha(numero);
            }
                if (pilhaimpar.estaVazia() && pilhaPar.estaVazia()) {
                    System.out.println("Pilha vazia");
                } else if (numero==0) {
                    Integer desempilhandopar = pilhaPar.desempilha();
                    Integer desempilhandoimpar = pilhaimpar.desempilha();

                    System.out.println("desempilhando um elemento de cada pilha pelo else");
                    System.out.println(desempilhandopar);
                    System.out.println(desempilhandoimpar);

                }

            }
        while (!(pilhaimpar.estaVazia() && pilhaPar.estaVazia())) {
            System.out.println("desempilhando todos os elementos pelo while ");
            Integer desempilhandopar = pilhaPar.desempilha();
            Integer desempilhandoimpar = pilhaimpar.desempilha();

            System.out.println("desempilhando pilha par "+desempilhandopar);
            System.out.println("desempilhando pilha impar " +desempilhandoimpar);
        }
        System.out.println(pilhaimpar);
        System.out.println(pilhaPar);
    }
}
