package org.example.teste.aula.logica.pilha;

public class Pilha <T> extends PilhaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        }
    }

    public T desempilha() {
        if (estaVazia()) {
           return null;
        }
        //return this.elementos[--tamanho];
        T elemento = this.elementos[this.tamanho-1];
        tamanho--;
        return elemento;
    }


    public boolean estaVazia() {
        if (this.tamanho == 0) {
            return true;
        }
        return false;
    }

    public T topo() {
        if (estaVazia()) {
           throw new IllegalArgumentException("Pilha está vazia");
       }
       return this.elementos[tamanho - 1];
   }

}
