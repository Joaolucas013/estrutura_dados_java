package org.example.teste.aula.aula;

import org.example.teste.aula.vetor.VetorObject;

public class Aula08 {
    public static void main(String[] args) {

        VetorObject vetor = new VetorObject(8);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        System.out.println(vetor);

        System.out.println("***  depois  *** ");

        int pos = vetor.existe("C");
        if(pos>-1){
            vetor.remover(pos);
        } else {
            System.out.println("Elemento não existe");
        }
        System.out.println(vetor);
    }
}
