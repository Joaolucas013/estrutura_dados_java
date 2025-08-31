package pilha;

import java.util.List;

public interface Empilhavel<T> {

    void empilhar(T dado);

  void  atualizar(T dado);

    T espiar();

    T desempilhar();

    Boolean estaCheia();

    Boolean estaVazia();

    List<T> imprimir();
    void aumentaCapacidade();
    String imprimirDoTopo();
}
