package StreamsELambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Exibe os números do array
        numeros.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Verifica a condição especifícada para cada valor e confirma se é verdadeira ou não
        numeros.stream().forEach(n -> System.out.println("É par? " + (n % 2 == 0)));

        // Filtra a lista padrão para criar uma nova lista somente com os itens pares
        List<Integer> numerosFiltradosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Números pares: " + numerosFiltradosPares);

        // Aqui percorremos a lista mas pulando os indices especificados
        numeros.stream()
                .skip(4)
                .forEach(n -> System.out.print(n));


        // Lista de Numeros da Mega Sena
        List<Integer> numerosDaMegaSenha = Arrays.asList(11,17,23,32,43,50);

        // filtro que mostra apenas o numeros terminados com 3 e 7 :)
        numerosDaMegaSenha.stream()
                .distinct()
                .filter(e -> e % 10 == 3 || e % 10 == 7)
                .forEach(e -> System.out.println("" + e));

        numerosDaMegaSenha.stream()
                .map(e -> e * 2)
                .forEach(e -> System.out.println(e));


        String coletado  = numerosDaMegaSenha.stream()
                .map(e-> String.valueOf(e)  )
                .collect(Collectors.joining(";"));
        System.out.println(coletado);


        numeros.stream()
                .forEach(n -> System.out.println("Thread: " + Thread.currentThread().getName() + " - Número: " + n));

        numeros.parallelStream()
                .forEach(n -> System.out.println("Thread: " + Thread.currentThread().getName() + " - Número: " + n));
    }
}
