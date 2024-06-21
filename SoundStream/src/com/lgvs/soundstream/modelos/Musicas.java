package com.lgvs.soundstream.modelos;

public class Musicas extends Audio {
    private String album;
    private String artista;
    private String genero;

    public Musicas(String titulo, String album, String artista, String genero) {
        super(titulo);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musicas{" +
                "titulo: " + getTitulo()+
                ", album: " + getAlbum() +
                ", artista: " + getArtista() +
                ", genero: " + getGenero()  +
                ", total de curtidas " + getTotalCurtidas() +
                ", total de reproduções " + getTotalReproducoes() +
                ", total de classificao " + getClassificacao() +
                '}';
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        if(this.getTotalCurtidas() >= 1000){
            return 5;
        }else if (this.getTotalCurtidas() >= 800){
            return 4;
        }else if(this.getTotalCurtidas() >= 600){
            return 3;
        } else if (this.getTotalCurtidas() >= 400) {
            return 2;
        }else{
            return 0;
        }
    }
}
