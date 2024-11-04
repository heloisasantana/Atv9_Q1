package com.example.atv9_q1;

public class Atleta {
    private String nome;
    private String dataNascimento;
    private String bairro;

    public Atleta(String nome, String dataNascimento, String bairro) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nBairro: " + bairro;
    }
}
