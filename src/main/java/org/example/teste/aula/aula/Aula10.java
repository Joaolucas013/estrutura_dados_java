package org.example.teste.aula.aula;

import org.example.teste.aula.logica.Contato;
import org.example.teste.aula.logica.lista.Lista;

public class Aula10 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(10);

        Contato c1 = new Contato("Marco reus", "40228922", "reus2022@gmail.com");
        Contato c2 = new Contato("Gabigol", "400283922", "Lilgabiprime2019@gmail.com");
        Contato c3 = new Contato("Joao", "40028922", "Joaoolucass20001@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
//        System.out.println(vetor);

        System.out.println(vetor.contem(c2));
        //System.out.println(vetor);
    }
}
