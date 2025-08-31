package pilha;

public class Testar {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();  // T
        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(6);
        pilha.empilhar(7);
        pilha.empilhar(8);
        pilha.empilhar(9);
        pilha.empilhar(10);
        pilha.empilhar("JOAO");  // T


        System.out.println(pilha.espiar()); // 10
        System.out.println(pilha.desempilhar()); // 10
        System.out.println(pilha.espiar()); // 9


        System.out.println(pilha.imprimir());
        System.out.println(pilha.imprimirDoTopo());

    }
}
