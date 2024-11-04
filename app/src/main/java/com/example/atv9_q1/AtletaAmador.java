package com.example.atv9_q1;

public class AtletaAmador extends Atleta {
    private String academia;
    private int recordeSegundos;

    public AtletaAmador(String nome, String dataNascimento, String bairro, String academia, int recordeSegundos) {
        super(nome, dataNascimento, bairro);
        this.academia = academia;
        this.recordeSegundos = recordeSegundos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAcademia: " + academia + "\nRecorde (s): " + recordeSegundos;
    }
}

