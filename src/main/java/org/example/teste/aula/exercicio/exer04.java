package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.pilha.Pilha;

import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero");
            int numero = scan.nextInt();

            if(numero%2==0){
                System.out.println("empilhando numero: "+numero);
                pilha.empilha(numero);
            } else if (!(numero%2==0)) {
                if(pilha.estaVazia()){
                    System.out.println("pilha vazia");
                }
                else {
                    System.out.println("impar, desempilhando numero " + pilha.desempilha());

                }

            }

        }

        while(!pilha.estaVazia()){
            System.out.println("desempilhando tudo");
            pilha.desempilha();
        }
        System.out.println(pilha);
    }

}