package com.example.atv9_q1;

public class AtletaJuvenil extends Atleta {
    private int anosDePratica;

    public AtletaJuvenil(String nome, String dataNascimento, String bairro, int anosDePratica) {
        super(nome, dataNascimento, bairro);
        this.anosDePratica = anosDePratica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnos de Prática: " + anosDePratica;
    }
}
