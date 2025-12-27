package ExerciciosDeLogica.ExerciciosBase.HackerHank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class ResultDiferencaDiagonal {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int somaDiagonalUm = 0;
        int somaDiagonalDois = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            somaDiagonalUm += arr.get(i).get(i);

            int  j = n - 1 - i;
            somaDiagonalDois += arr.get(i).get(j);
        }

        int diferencaAbsoluta = Math.abs(somaDiagonalUm - somaDiagonalDois);

        return diferencaAbsoluta;
    }
}

public class DiferencaDeDiagonal {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = ResultDiferencaDiagonal.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

