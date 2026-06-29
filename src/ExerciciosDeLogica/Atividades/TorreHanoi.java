/*
*   OBJETIVO: criar um esquema funcional que resolve a torre de hanoi
*   1 - Definir as 3 torres(pilhas)
*   2 - discos serão representados por valores
*   3 - nunca pode haver um disco maior acima de um disco menor
*
* */
package ExerciciosDeLogica.Atividades;

import java.util.Stack;

public class TorreHanoi {

    public void torres(){
        Stack<Integer> torreA = new Stack<>();
        Stack<Integer> torreB = new Stack<>();
        Stack<Integer> torreC = new Stack<>();

        // O valor 0 representa a base das torres
        torreA.push(0);
        torreB.push(0);
        torreC.push(0);

        torreA.push(3);
        torreA.push(2);
        torreA.push(1);

        // Primeiro Movimento
        if (torreC.peek() < torreA.peek()) {
            torreC.push(torreA.peek());
            torreA.pop();
        } else {
            System.out.println("Movimento não permitido");
        }
        System.out.println("Primeira rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("--------------");

        // Segundo Movimento
        if (torreB.peek() < torreA.peek()) {
            torreB.push(torreA.peek());
            torreA.pop();
        } else {
            System.out.println("Movimento não permitido");
        }

        System.out.println("Segunda rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("--------------");

        // Terceiro movimento
        if (torreB.peek() > torreC.peek()){
            torreB.push(torreC.peek());
            torreC.pop();
        } else {
            System.out.println("Movimento não permitido");
        }

        System.out.println("Terceira rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("--------------");


        // Quarta movimento
        if (torreC.peek() < torreA.peek()){
            torreC.push(torreA.peek());
            torreA.pop();
        } else {
            System.out.println("Movimento não permitido");
        }

        System.out.println("Quarta rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("--------------");

        // Quinta movimento
        if (torreA.peek() < torreB.peek()){
            torreA.push(torreB.peek());
            torreB.pop();
        } else {
            System.out.println("Movimento não permitido");
        }

        System.out.println("Quinta rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("--------------");

        // Sexto movimento
        if (torreC.peek() > torreB.peek()){
            torreC.push(torreB.peek());
            torreB.pop();
        } else {
            System.out.println("Movimento não permitido");
        }

        System.out.println("Sexto rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("--------------");

        // Setimo movimento
        if (torreC.peek() > torreA.peek()){
            torreC.push(torreA.peek());
            torreA.pop();
        } else {
            System.out.println("Movimento não permitido");
        }

        System.out.println("Setimo rodada de movimentos");
        System.out.println("Torre A " + torreA);
        System.out.println("Torre B " + torreB);
        System.out.println("Torre C " + torreC);
        System.out.println("PARABÉNS");
    }

    public static void main(String[] args) {
        TorreHanoi torreHanoi = new TorreHanoi();

        torreHanoi.torres();
    }
}
