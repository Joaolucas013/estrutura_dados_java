package fila;

public class FilaTeste {
    public static void main(String[] args) {

        Fila fila = new Fila();
        Fila filaString = new Fila();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);




        System.out.println(fila.imprimir());
        System.out.println(fila.getPonteiroFim().getAnterior().getDado()); // 5.anterior = 4

        // System.out.println(fila.desenfileirar());

        System.out.println(fila.imprimir());

        System.out.println(fila.frente());
        System.out.println(fila.Fim());





    }
}
