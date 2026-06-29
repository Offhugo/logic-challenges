package EstruturasDeDados.BuscaBinaria;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaiorValor {

    public static int buscaBinaria(int[] array, int menor, int maior, int valorBuscado) {
        // COndição que define a continuidade da busca
        if (maior >= menor) {
            // Linha que atualiza o INDICE meio para poder sempre diminuir o range, sempre pegando a posiçãoCentral
            int meio = menor + (maior + menor) / 2;

            // Verifica se o valor está nesse novo meio
            if (valorBuscado == array[meio]) {
                return array[meio];
            }

            // Caso o meio seja MAIOR que o valor buscado
            if (array[meio] > valorBuscado) {
                return buscaBinaria(array, menor, meio - 1, valorBuscado);
            }

            // Aqui temos o caso contrário de forma "Autómatica" que é caso o meio seja MENOR
            return buscaBinaria(array, meio + 1, maior, valorBuscado);
        }

        // Caso de tratamento de falha, caso o código não consiga o que pretende
        return - 1;
    }

    public static void main(String[] args) {
        int[] array = {929399999, 99999999, 392309203, 323923829, 999999999, 7, 99999999, 1, 99999999};

        Arrays.sort(array);

        System.out.println("Valor: " + buscaBinaria(array, 0, array.length - 1, 1));

    }
}
