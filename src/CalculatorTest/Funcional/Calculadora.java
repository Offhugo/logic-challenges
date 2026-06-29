package CalculatorTest.Funcional;

import java.util.Scanner;

import CalculatorTest.Interfaces.Start;
import CalculatorTest.Service.CalculosBasicos;

        public  class Calculadora implements Start {

                public static void menu() {

                    Scanner sc = new Scanner(System.in);
                    CalculosBasicos calculosBasicos = new CalculosBasicos();

                    int count = 0;
                    while (count == 0) {
                        System.out.println("Selecione o Calculo:");
                        System.out.println(
                                "1 - Adição;\n" +
                                        "2 - Subtração\n" +
                                        "3 - Multiplicação\n" +
                                        "4 - Divisão\n" +
                                        "5 - Sair"
                        );
                        int opcao = sc.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println("ADIÇÃO: ");
                                System.out.println("Insira o primeiro valor:");
                                double numberOneA = sc.nextDouble();
                                System.out.println("Insira o segundo valor:");
                                double numberTwoA = sc.nextDouble();

                                System.out.println("Resultado: " + calculosBasicos.soma(numberOneA, numberTwoA));
                                break;
                            case 2:
                                System.out.println("SUBTRAÇÃO: ");
                                System.out.println("Insira o primeiro valor:");
                                double numberOneS = sc.nextDouble();
                                System.out.println("Insira o segundo valor:");
                                double numberTwoS = sc.nextDouble();

                                System.out.println("Resultado: " + calculosBasicos.subtracao(numberOneS, numberTwoS));
                                break;
                            case 3:
                                System.out.println("MULTIPLICAÇÃO: ");
                                System.out.println("Insira o primeiro valor:");
                                double numberOneM = sc.nextDouble();
                                System.out.println("Insira o segundo valor:");
                                double numberTwoM = sc.nextDouble();

                                System.out.println("Resultado: " + calculosBasicos.multiplicaocao(numberOneM, numberTwoM));
                                break;
                            case 4:
                                System.out.println("DIVISÃO: ");
                                System.out.println("Insira o primeiro valor:");
                                double numberOneD = sc.nextDouble();
                                System.out.println("Insira o segundo valor:");
                                double numberTwoD = sc.nextDouble();

                                System.out.println("Resultado: " + calculosBasicos.divisao(numberOneD, numberTwoD));
                                break;
                            case 5:
                                System.out.println("Obrigado por utilizar nosso serviço");
                                count = 1;
                        }
                    }
                }

            }




