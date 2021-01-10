package logic;

public class Calculation {

    public double addition (double num1, double num2){
        return (num1 + num2);
    }

    public double substraction (double num1, double num2){
        return (num1 - num2);
    }

    public double multiplication (double num1, double num2){
        return (num1 * num2);
    }

    public double division (double num1, double num2){
        if (num2 == 0){
            throw new ArithmeticException("На 0 делить нельзя!");
        }
        return (num1 / num2);
    }

    public double remainder (double num1, double num2){
        return (num1 % num2);
    }

}
