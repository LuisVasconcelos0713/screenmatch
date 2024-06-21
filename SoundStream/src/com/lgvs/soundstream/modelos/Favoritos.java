package com.lgvs.soundstream.modelos;

public class Favoritos {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 5){
            System.out.println(audio.getTitulo() + " Considerado sucesso absoluto! ");
        }else {
            System.out.println(audio.getTitulo() + " Também é um dos que todos estão ouvindo! ");
        }
    }
}
