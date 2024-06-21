package com.lgvs.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episidiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisidio;

    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, int duracaoEmMinutos, int temporadas, int episidiosPorTemporada, boolean ativa, int minutosPorEpisidio) {
        super(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
        this.temporadas = temporadas;
        this.episidiosPorTemporada = episidiosPorTemporada;
        this.ativa = ativa;
        this.minutosPorEpisidio = minutosPorEpisidio;
    }

    public int duracaoEmMinutos(){
        int duracao = this.episidiosPorTemporada * this.minutosPorEpisidio * this.minutosPorEpisidio;
        return duracao;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisidiosPorTemporada() {
        return episidiosPorTemporada;
    }

    public void setEpisidiosPorTemporada(int episidiosPorTemporada) {
        this.episidiosPorTemporada = episidiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisidio() {
        return minutosPorEpisidio;
    }

    public void setMinutosPorEpisidio(int minutosPorEpisidio) {
        this.minutosPorEpisidio = minutosPorEpisidio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.episidiosPorTemporada * this.minutosPorEpisidio * this.minutosPorEpisidio;
    }
}
