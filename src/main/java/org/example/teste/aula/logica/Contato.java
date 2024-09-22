package org.example.teste.aula.logica;

import java.util.Objects;

public class Contato {
    private String nome;
    private String numero;
    private String email;

    public Contato(String nome, String numero, String email) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(numero, contato.numero) &&
                Objects.equals(email, contato.email);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email;
    }
}
