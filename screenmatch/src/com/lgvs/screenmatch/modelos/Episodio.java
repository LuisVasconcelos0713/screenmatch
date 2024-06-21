package com.lgvs.screenmatch.modelos;

import com.lgvs.screenmatch.calculos.*;

public class Episodio implements Classificacao {
    private String nome;
    private int numero;
    private Serie serie;
    private int totalDeVisualizações;

    public Episodio(String nome, int numero, Serie serie,int totalDeVisualizações) {
        this.nome = nome;
        this.numero = numero;
        this.serie = serie;
        this.totalDeVisualizações = totalDeVisualizações;
    }


    @Override
    public int getClassificacao() {
        if(totalDeVisualizações > 100){
            return 4;
        } else {
            return 2;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
