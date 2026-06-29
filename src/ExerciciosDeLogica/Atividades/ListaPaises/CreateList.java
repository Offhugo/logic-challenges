package ExerciciosDeLogica.Atividades.ListaPaises;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    static List<RankPaises> paisesRanks = new ArrayList<>();


    public static void criandoLista(String nome, int rank){
        paisesRanks.add(new RankPaises(nome, rank));
    }

    public static void pesquisarNaLista(String nome){
        if (paisesRanks.contains(nome) == true){
            System.out.println("O pais está no rank");
        } else {
            System.out.println("O pais não está no rank");
        }
    }
}
