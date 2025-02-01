package Projeto;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;

    public Pessoa(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    public Pessoa(){

    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Data de nascimento:" + dataNascimento;
    }
}

