package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.lista.Lista;

public class exer02 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>();
        lista.adiciona("A"); // 0
        lista.adiciona("B"); //1
        lista.adiciona("A"); //2


       // System.out.println(lista);
        System.out.println(lista.ultimaPosicao("A"));

    }
}
