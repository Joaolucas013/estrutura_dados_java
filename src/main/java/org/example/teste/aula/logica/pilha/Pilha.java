package pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> implements Empilhavel<T>{

    public int ponteiroTopo;
    public T[] elementos;

    public  Pilha(int capacidade){
        this.ponteiroTopo = -1;
        this.elementos = (T[]) new Object[capacidade];
    }

    public Pilha(){
        this(5);
    }


    @Override
    public void empilhar(T dado) {
        if (estaCheia()){
            aumentaCapacidade();
        }
        this.ponteiroTopo++;
        this.elementos[ponteiroTopo] = dado;
    }

    @Override
    public void atualizar(T dado) {
        if (!estaVazia()){
            this.elementos[ponteiroTopo] = dado;
        }

    }

    @Override
    public T espiar() {
       T elementoTopo = null;
       if (!estaVazia()) {
           elementoTopo = this.elementos[ponteiroTopo];
       } else{
           System.out.println("Pilha está vazia!");
       }
       return elementoTopo;
    }

    @Override
    public T desempilhar() {
       T desempilhado=null;

       if (!estaVazia()){
           desempilhado = this.elementos[ponteiroTopo];
           ponteiroTopo--;
       } else{
           System.out.println("Pilha esta vazia!");
       }
       return desempilhado;
    }

    @Override
    public Boolean estaCheia() {
        return this.ponteiroTopo == elementos.length -1;
    }

    @Override
    public Boolean estaVazia() {
        return ponteiroTopo ==-1;
    }

    @Override
    public List<T> imprimir() {
        List<T> list = new ArrayList<>();

        for (int i = 0; i <= ponteiroTopo; i++) {
            list.add(this.elementos[i]);
        }

        return list;
    }

    @Override
    public void aumentaCapacidade() {
        if (estaCheia()) {
            T[] novosElementos = (T[]) new Object[(int) (this.elementos.length * 1.5)];
            for (int i = 0; i <= ponteiroTopo; i++) {
                novosElementos[i] = elementos[i];
            }
          this.elementos = novosElementos;
        }

    }

    @Override
    public String imprimirDoTopo() {
        String inverso= "";

        for (int i = ponteiroTopo; i >= 0 ; i--) {  // ponteiroTopo = 10
            inverso += this.elementos[i];  //"1,2,3"
            if (i!=0){
                inverso += ",";
            }
        }
        return inverso;
    }
}
