package logic;

public class TemperatureLogic {
    public double cToK(double num1) {
        return num1 + 273.15;
    }

    public double cToF(double num1) {
        return (num1 * 9 / 5) + 32;
    }

    public double cToRe(double num1) {
        return num1 * 0.8;
    }

    public double cToRa(double num1) {
        return num1 * 1.8 + 32 + 459.67;
    }

    public double cToRo(double num1) {
        return num1 * 21 / 40 + 7.5;
    }

    public double cToN(double num1) {
        return num1 * (33 / 100);
    }

    public double cToD(double num1) {
        return (100 - num1) * 3 / 2;
    }

    public double kToC(double num1){
        return num1 - 273.15;
    }

    public double fToC(double num1){
        return ((num1 - 32) * (5 / 9));
    }

    public double reToC(double num1){
        return (num1 / 0.8);
    }

    public double raToC(double num1){
        return ((num1 - 459.67 - 32) / 1.8);
    }

    public double roToC(double num1){
        return ((40 / 21) * (num1 - 7.5));
    }

    public double nToC(double num1){
        return num1 * (100 / 33);
    }

    public double dToC(double num1){
        return 100 - num1 * 2 / 3;
    }
}
