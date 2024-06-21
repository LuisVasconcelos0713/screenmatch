package com.lgvs.screenmatch.calculos;
import com.lgvs.screenmatch.modelos.*;
public class CalculadoraDeTempo {
    private int tempoTotal;
    private int tempoTotalEmHoras;

    public CalculadoraDeTempo() {
        this.tempoTotal = 0;
    }


//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
        tempoTotalEmHoras = tempoTotal / 60;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public int getTempoTotalEmHoras() {
        return tempoTotalEmHoras;
    }

}
