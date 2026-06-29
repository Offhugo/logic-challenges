package EstruturasDeDados.BuscaBinaria;

import java.util.ArrayList;

public class TresMaioresElementos {

    public static ArrayList<Integer> minhaSolucaoTresMaiores (int[] array) {
        ArrayList<Integer> maioresElementos = new ArrayList<>();

        int maior = - 1;
        int segundoMaior = - 1;
        int terceiroMaior = - 1;

        for (int num : array) {
            if (num > maior) {
                terceiroMaior = segundoMaior;
                segundoMaior = maior;
                maior = num;
            }
            else if (num < maior && num > segundoMaior) {
                terceiroMaior = segundoMaior;
                segundoMaior = num;
            }
            else if (num < segundoMaior && num > terceiroMaior) {
                terceiroMaior = num;
            }
        }

        maioresElementos.add(maior);
        maioresElementos.add(segundoMaior);
        maioresElementos.add(terceiroMaior);

        return maioresElementos;

    }

    public static void main(String[] args) {
        int[] array = {56, 7, 45, 145, 145, 66, 7, 28, 1, 0, 46, 27, 81};

        ArrayList<Integer> maioresElementos = new ArrayList<>();

        System.out.println("Resultado: " + minhaSolucaoTresMaiores(array));
    }
}
