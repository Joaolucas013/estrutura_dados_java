package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.pilha.Pilha;

public class IsBalanceado {
    public static void main(String[] args) {
        imprime("A+B]+C");

    }

    public static void imprime(String expressao){
        System.out.println("Esta balanceado: " + estaBalanceado(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean estaBalanceado(String expressao){

        Pilha<Character> pilha = new Pilha<>();
        char simbolo, topo;

        for (int i = 0; i <expressao.length() ; i++) {
            simbolo = expressao.charAt(i);

         if(ABRE.indexOf(simbolo) >-1){
             pilha.empilha(simbolo);

         } else if (FECHA.indexOf(simbolo) >-1) {
             if(pilha.estaVazia()){
                 return false;
             }
             else{
                 topo = pilha.desempilha();
                 if((FECHA.indexOf(simbolo) != ABRE.indexOf(simbolo))){
                     return false;
                 }
             }

         }

        }
        return pilha.estaVazia();
    }

}
