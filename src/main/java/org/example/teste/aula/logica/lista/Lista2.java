package org.example.teste.aula.logica.lista;

import org.example.teste.aula.logica.pilha.PilhaEstatica;

public class Lista2 <T> extends PilhaEstatica<T> {

public Lista2(){
    super();
}
    public Lista2(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(T elemento){
   return super.adiciona(elemento);

    }

    public boolean adiciona(int posicao, T elemento){
    return super.adiciona(posicao, elemento);
    }


    public void remove(int posicao){
    super.remover(posicao);
    }
}
