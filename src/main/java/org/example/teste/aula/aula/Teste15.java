package org.example.teste.aula.aula;

import org.example.teste.aula.logica.fila.Fila;
import org.example.teste.aula.logica.fila.FilaPrioridade;

public class Teste15 {
    public static void main(String[] args) {


        FilaPrioridade<Integer> filaPrioridade =new FilaPrioridade<>();
        Fila<Integer> fila = new Fila<>();
        System.out.println("Dados abaixo sem prioridade");

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);
        System.out.println(fila);

        System.out.println("\ndados abaixo com prioridade");
        filaPrioridade.enfileirar(1);
        filaPrioridade.enfileirar(3);
        filaPrioridade.enfileirar(2);
        System.out.println(filaPrioridade);


    }
}
