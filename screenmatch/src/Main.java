import com.lgvs.screenmatch.calculos.*;
import com.lgvs.screenmatch.modelos.*;

public class Main {
    public static void main(String[] args) {
        Serie favorito = new Serie("Dark",2018,true,554,3,5,false,45);
        Filme favorito2 = new Filme("Maraboune",2020,true,554);
        Filme favorito3 = new Filme("Soul",2024,true,554);


        //favorito.setNome("The Matrix");
        //favorito.setAnoDeLancamento(1999);
        //favorito.setDuracaoEmMinutos(135);
        //favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        favorito2.avalia(7);
        favorito3.avalia(9.43);

        System.out.println("Média de avaliações do filme: " +favorito.MediaAvaliacoes());
        System.out.println(favorito.exibeFichaTecnica());
        System.out.println(favorito.duracaoEmMinutos());

        System.out.println("duração do filme: " + favorito.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(favorito2);
        calculadoraDeTempo.inclui(favorito3);
        calculadoraDeTempo.inclui(favorito);

        System.out.println(calculadoraDeTempo.getTempoTotalEmHoras());

        Episodio episodio1 = new Episodio("LuisEp",1,favorito,300);
        Recomendacao recomenda = new Recomendacao();

        recomenda.filtra(episodio1);
        recomenda.filtra(favorito2);
        recomenda.filtra(favorito3);
    }


}