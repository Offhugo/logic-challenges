package ExerciciosDeLogica.Atividades.ListaPaises;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        CreateList createList = new CreateList();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o nome do pais");
            String nome = sc.next();
            System.out.println("Digite o rank do país");
            int rank = sc.nextInt();

            CreateList.criandoLista(nome, rank);
        }

        // E SE OS RANKS FOREM INSERIDOS EM ORDEM ALEATORIA E EU QUISER ORDENAR

        for (RankPaises nome : CreateList.paisesRanks){
            System.out.println(nome);
        }

        //System.out.println(CreateList.pesquisarNaLista());
    }
}
