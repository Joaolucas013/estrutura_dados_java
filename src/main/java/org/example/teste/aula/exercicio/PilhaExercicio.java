package org.example.teste.aula.exercicio;

public class PilhaExercicio {

    private String nomeLivro;
    private String autor;
    private String anoLancamento;
    private String isbn;

 public PilhaExercicio( String nomeLivro, String autor, String anoLancamento, String isbn){
     this.nomeLivro = nomeLivro;
     this.autor = autor;
     this.anoLancamento = anoLancamento;
     this.isbn = isbn;
 }


    @Override
    public String toString() {
        return "isbn='" + isbn + '\'' +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }
}
