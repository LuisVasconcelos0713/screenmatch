package com.lgvs.soundstream.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio(String titulo) {
        this.titulo = titulo;
        this.totalReproducoes = 0;
        this.totalCurtidas = 0;
        this.classificacao = 0;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

}
