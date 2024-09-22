package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.pilha.Pilha;

public class QualquerBaseBinario {
    public static void main(String[] args) {

        System.out.println(decimalBinario(10));
        System.out.println(QualquerBase(10, 16));

    }

    public static String decimalBinario(int numero){
        Pilha<Integer> pilha = new Pilha<>();
        String binario = "";
        int resto;

       while (numero>0){
           resto = numero%2;
           pilha.empilha(resto);
           numero/=2;
       }

       while (!pilha.estaVazia()){
         binario+=pilha.desempilha();
       }
       return binario;
    }

    public static String QualquerBase(int numero, int base){
        Pilha<Integer> pilha = new Pilha<>();
        String numBase = "";
        int resto;
        String bases="0123456789ABCDEF";

        while (numero>0){
            resto = numero%base;
            pilha.empilha(resto);
            numero/=base;
        }

        while (!pilha.estaVazia()){
            numBase+=bases.charAt(pilha.desempilha());
        }
        return numBase;
    }
}
