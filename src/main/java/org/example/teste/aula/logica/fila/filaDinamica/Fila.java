package fila;

public class Fila<T> implements Enfileiravel<T> {

    private NoDuplo<T> ponteiroInicio;
    private NoDuplo<T> ponteiroFim;
    private int quantidade;
    private int capacidade;

    public Fila(int capacidade) {
        this.ponteiroFim = null;
        this.ponteiroInicio = null;
        this.quantidade = 0;
        this.capacidade = capacidade;
    }

    public Fila() {
        this(10);
    }


    @Override
    public void enfileirar(T dado) {
        if(!estaCheia()){   
            var novoNo = new NoDuplo(dado); 
            novoNo.setAnterior(ponteiroFim);

            if (!estaVazia()){  
                ponteiroFim.setProximo(novoNo);
            } else{    
                ponteiroInicio = novoNo;  /
            }
            ponteiroFim = novoNo;  
            quantidade++;          
        }
    }

    @Override
    public void atualizar(T dado) {
        if (!estaVazia()){
            ponteiroInicio.setDado(dado);
        } else{
            System.out.println("Fila está vazia");
        }
    }

    @Override
    public T frente() {
       T primeiro = null;
       if (!estaVazia()){
           primeiro = ponteiroInicio.getDado();
       } else{
           System.out.println("Fila esta vazia!!!");
       }
       return primeiro;
    }

    @Override
    public T Fim() {
        T ultimo = null;
        if (!estaVazia()){
            ultimo = ponteiroFim.getDado();
        } else{
            System.out.println("Fila esta vazia!!!");
        }
        return ultimo;
    }

    @Override
    public T desenfileirar() {
        T desenfileirado = null;  // [1,2,3,4,5,6] 6.anterior =
        if (!estaVazia()) {
            desenfileirado = ponteiroInicio.getDado();
            ponteiroInicio = ponteiroInicio.getProximo();
            quantidade--;

            if (!estaVazia()) {
                ponteiroInicio.setAnterior(null);
            } else {
                ponteiroFim = null;
            }
        }
        return desenfileirado;
    }

    @Override
    public boolean estaCheia() {
        return quantidade == capacidade;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    @Override
    public String imprimir() {
        String imprimir = "";
        var aux = ponteiroInicio;

        for (int i = 0; i < quantidade; i++) {
            imprimir += aux.getDado();
            aux = aux.getProximo();
            if (i != quantidade - 1) {
                imprimir += ",";
            }
        }
        return imprimir;
    }

    public NoDuplo<T> getPonteiroInicio() {
        return ponteiroInicio;
    }

    public void setPonteiroInicio(NoDuplo<T> ponteiroInicio) {
        this.ponteiroInicio = ponteiroInicio;
    }

    public NoDuplo<T> getPonteiroFim() {
        return ponteiroFim;
    }

    public void setPonteiroFim(NoDuplo<T> ponteiroFim) {
        this.ponteiroFim = ponteiroFim;
    }
}
