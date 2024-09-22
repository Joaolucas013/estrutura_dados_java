package org.example.teste.aula.logica.fila;

public class Paciente implements Comparable<Paciente>{
    private String nome;
    private int prioridade;

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Paciente() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }



    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", prioridade=" + prioridade;
    }

// compara a prioridade entre os pacientes, os que ja estão na fila com os que serao inseridos
    @Override
    public int compareTo(Paciente paciente) {
        if (this.prioridade > paciente.getPrioridade()) {
            return 1;
        } else if (this.prioridade < paciente.getPrioridade()) {
            return -1;
        }
        return 0;
    }
}
