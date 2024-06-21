package com.lgvs.soundstream;

import com.lgvs.soundstream.modelos.Favoritos;
import com.lgvs.soundstream.modelos.Musicas;
import com.lgvs.soundstream.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musicas musicas = new Musicas("Ela se morde","semreh","ryu the runner","trap-brasileiro");

        Podcast podcast = new Podcast("Episodio 543 IGÃO E MITICO","Igão e Mitíco","Igão e mitico trocando ideia");

        for(int i = 0; i <= 1200; i++){
            musicas.reproduz();
            podcast.reproduz();
        }

        for(int i = 0; i <= 800; i++){
            musicas.curte();
            podcast.curte();
        }

        System.out.println(musicas.toString());
        System.out.println(podcast.toString());

        Favoritos favoritos = new Favoritos();

        favoritos.inclui(musicas);
        favoritos.inclui(podcast);
    }
}