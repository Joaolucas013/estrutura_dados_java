package org.example.teste.aula.aula;

import org.example.teste.aula.vetor.VetorObject;

public class Aula7 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(6);
        vetor.adiciona("C");
        vetor.adiciona("D");

        System.out.println("\n**antes***");
        System.out.println(vetor);

        System.out.println(vetor.adicionarAleatorio(0, "B"));
        System.out.println("\n**depois***");
        System.out.println(vetor);

        System.out.println("\n*****depois*****");
        System.out.println(vetor.adicionarAleatorio(0, "A"));
        System.out.println(vetor);

    }
}
