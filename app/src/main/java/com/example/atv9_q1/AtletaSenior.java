package com.example.atv9_q1;

public class AtletaSenior extends Atleta {
    private boolean problemasCardiacos;

    public AtletaSenior(String nome, String dataNascimento, String bairro, boolean problemasCardiacos) {
        super(nome, dataNascimento, bairro);
        this.problemasCardiacos = problemasCardiacos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProblemas Cardíacos: " + (problemasCardiacos ? "Sim" : "Não");
    }
}

