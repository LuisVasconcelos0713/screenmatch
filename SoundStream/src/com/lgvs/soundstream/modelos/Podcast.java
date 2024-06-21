package com.lgvs.soundstream.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao) {
        super(titulo);
        this.host = host;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Musicas{" +
                "titulo: " + getTitulo()+
                ", Host: " + getHost() +
                ", Descricao: " + getDescricao() +
                ", total de curtidas " + getTotalCurtidas() +
                ", total de reproduções " + getTotalReproducoes() +
                ", total de classificao " + getClassificacao() +
                '}';
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() >= 1000){
            return 5;
        }else if (this.getTotalReproducoes() >= 800){
            return 4;
        }else if(this.getTotalReproducoes() >= 600){
            return 3;
        } else if (this.getTotalReproducoes() >= 400) {
            return 2;
        }else{
            return 0;
        }
    }
}
