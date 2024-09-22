package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.pilha.Pilha;

public class Palindromo {
    public static void main(String[] args) {
        isPalindromo("ADA");
        isPalindromo("Joao");
        isPalindromo("reinier");

    }
public static void isPalindromo(String palavra){
    System.out.println(palavra + " é palindromo? " + palindromo(palavra));
}

    public static boolean palindromo(String palavra){
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i <palavra.length() ; i++) {
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";

        while(!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }
        if (palavra.equalsIgnoreCase(palavraInversa)) {

            return true;
        }
      return false;
    }


}