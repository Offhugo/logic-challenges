package StreamsELambdas.FundamentosStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosBasicosStreams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> pontuacoes = List.of(55, 20, 99, 15, 80, 40, 100);

        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        List<String> pessoasNomesMaiusculos = pessoas.stream()
                .map(p -> p.getNome().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Nomes em maíusculo: " + pessoasNomesMaiusculos);


        // Note que se o resulado for negativo, o primeiro valor(no caso b) é jogado para a direita
        // Mas se for positivo ele permanece a "frente" na esquerda
        pontuacoes.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .forEach(System.out::println);

        // Aqui tranformamos o número total de caracteres em inteiro e somamos
        int totalCaracteres = pessoas.stream()
                .mapToInt(s -> s.getNome().length())
                .sum();

        System.out.println("Total de letras: " + totalCaracteres);


    }
}
