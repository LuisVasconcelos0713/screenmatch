package com.lgvs.screenmatch.modelos;

import com.lgvs.screenmatch.calculos.*;

public class Filme extends Titulo implements Classificacao {
    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
    }

    @Override
    public int getClassificacao() {
        return (int) (MediaAvaliacoes() / 2);
    }
}
