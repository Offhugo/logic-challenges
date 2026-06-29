package CalculatorTest.Dominio;

public class Numbers {

    private  double numberOne;

    private double numberTwo;

    public Numbers(double numberOne, double numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
}
