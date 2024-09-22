package org.example.teste.aula.aula;

import org.example.teste.aula.logica.fila.Fila;
import org.example.teste.aula.logica.fila.FilaPrioridade;
import org.example.teste.aula.logica.fila.Paciente;

public class Teste16 {
    public static void main(String[] args) {


        FilaPrioridade<Paciente> filaPrioridade = new FilaPrioridade<>();
        Fila<Paciente> fila = new Fila<>();

        System.out.println("\nfila sem prioridade");
        fila.enfileira(new Paciente("A", 1));
        fila.enfileira(new Paciente("B", 3));
        fila.enfileira(new Paciente("C", 2));
        System.out.println(fila);

        System.out.println("\nfila com prioridade");
        filaPrioridade.enfileirar(new Paciente("A", 1));
        filaPrioridade.enfileirar(new Paciente("B", 3));
        filaPrioridade.enfileirar(new Paciente("C",2 ));
        System.out.println(filaPrioridade);

    }
}
