package StreamsELambdas.FundamentosStreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operacoes {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        List<Pessoa> streamPessoa = pessoas
                .stream()
                .filter(p -> p.idade > 21)
                .toList();

        // Nota que não há alteração na lista original, mesmo com a stream trabalhando
        System.out.println("Pessoas filtradas por idade: " + streamPessoa);
        System.out.println("Total de pessoas" + pessoas);

        // Aplicando filtro por nacionalidade
        List<String> streamPorNacionalidade = pessoas
                .stream()
                .filter(p -> p.getNacionalidade().equalsIgnoreCase("Brasil"))
                .map(p -> p.getNome())
                .collect(Collectors.toList());

        System.out.println("Pessoas com nacionalidade brasileira: " + streamPorNacionalidade);


        // Neste segmento nós ordenamos a lista pelo nome do individuo seguindo a ordem alfábetica
        List<Pessoa> streamOrdemAlfabetica = pessoas.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList());

        System.out.println("Pessoas em ordem alfábetica: " + streamOrdemAlfabetica);

        //

    }
}
