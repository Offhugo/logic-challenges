package EstruturasDeDados.BuscaBinaria;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SegundoMaiorValor {

    public static int primeiraSolucao(int[] arr) {
        // Objetivo: conseguir obter o segundo maior valor de um array
        AlgoritmoBinario algoritmoBinario = new AlgoritmoBinario();
        Arrays.sort(arr);
        int n = arr.length;

        if (n < 2) {
            return - 1;
        }

        int segundoValor = arr[n - 2];

        return segundoValor;
    }

    public static int segundaSolucao(int[] arr) {
        int primeiroEle = - 1, segundoEle = - 1;

        for (int num : arr) {
            if (num > primeiroEle) {
                primeiroEle = num;
            }
        }

        for (int num : arr) {
            if (num > segundoEle && num != primeiroEle) {
                segundoEle = num;
            }
        }

        return segundoEle;
    }

    public static int terceiraSolucao(int[] arr) {
        int primeiroEle = - 1, segundoEle = - 1;

        for (int num: arr) {
            if (num > primeiroEle) {
                segundoEle = primeiroEle;
                primeiroEle = num;
            }
            else if (num < primeiroEle && num > segundoEle) {
                segundoEle = num;
            }
        }

        return segundoEle;
    }

    public static void main(String[] args) {
        int[] array = {56, 7, 45, 145, 145, 66, 7, 28, 1, 0, 46, 27, 81};

        // Essa solução falha ao ter duplicatas
        // Pode ser resolvida ao transformarmos o array em set
        System.out.println("Primeira Solução: " + primeiraSolucao(array));
        System.out.println("Segunda Solução: " + segundaSolucao(array));
        // Mais performático que o segundo por percorrer uma unica ves o array
        System.out.println("Terceira Solução: " + terceiraSolucao(array));
    }
}
