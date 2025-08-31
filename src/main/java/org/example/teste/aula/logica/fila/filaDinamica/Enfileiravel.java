package fila;

public interface Enfileiravel<T> {
    void enfileirar(T dado);
    void atualizar(T dado);
    T frente();
    T Fim();
    T desenfileirar();
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();

}

