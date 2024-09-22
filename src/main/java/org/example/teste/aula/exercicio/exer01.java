package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.lista.Lista;

public class exer01 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>();
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println( lista.contem("f"));

    }
}
