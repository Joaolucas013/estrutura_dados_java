package org.example.teste.aula.exercicio;

import org.example.teste.aula.logica.lista.Lista;

public class exer03 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>();
        lista.adiciona("A"); // 0
        lista.adiciona("B"); //1
        lista.adiciona("C"); //2

       // System.out.println(lista);

      //  System.out.println(lista.obtem(0));
        lista.limpaTodos();
        System.out.println(lista);


    }
}
