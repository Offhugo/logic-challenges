package CalculatorTest.Service;

import CalculatorTest.Dominio.Numbers;
import CalculatorTest.Interfaces.Calculos;

public class CalculosBasicos implements Calculos {

    Numbers numbers = new Numbers(0,0);

    @Override
    public double divisao(double divisaoOne, double divisaoTwo) {
        numbers.setNumberOne(divisaoOne);
        numbers.setNumberTwo(divisaoTwo);

        divisaoOne = numbers.getNumberOne();
        divisaoTwo = numbers.getNumberTwo();

        return divisaoOne / divisaoTwo;
    }
    @Override
    public double soma(double somaOne, double somaTwo) {
        numbers.setNumberOne(somaOne);
        numbers.setNumberTwo(somaTwo);

        somaOne = numbers.getNumberOne();
        somaTwo = numbers.getNumberTwo();

        return somaOne + somaTwo;
    }

    @Override
    public double multiplicaocao(double multiplicacaoOne, double multiplicacaoTwo) {
        numbers.setNumberOne(multiplicacaoOne);
        numbers.setNumberTwo(multiplicacaoTwo);

        multiplicacaoOne = numbers.getNumberOne();
        multiplicacaoTwo = numbers.getNumberTwo();

        return multiplicacaoOne * multiplicacaoTwo;
    }

    @Override
    public double subtracao(double subtracaoOne, double subtracaoTwo) {
        numbers.setNumberOne(subtracaoOne);
        numbers.setNumberTwo(subtracaoTwo);

        subtracaoOne = numbers.getNumberOne();
        subtracaoTwo = numbers.getNumberTwo();

        return subtracaoOne - subtracaoTwo;
    }
}
