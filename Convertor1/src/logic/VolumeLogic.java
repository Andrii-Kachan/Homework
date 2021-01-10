package logic;

public class VolumeLogic {

    public double lToM3(double l) {
        return l / 1000;
    }

    public double lToGallon(double l) {
        return l / 3.785;
    }

    public double lToPint(double l) {
        return l * 2.113;
    }

    public double lToQuart(double l) {
        return l * 1.057;
    }

    public double lToBarrel(double l) {
        return l / 117;
    }

    public double lToCubicFoot(double l) {
        return l / 28.317;
    }

    public double lToCubicInch(double l) {
        return l * 61.024;
    }

    public double m3ToL(double num1){
        return num1 * 1000;
    }

    public double gallonToL(double num1){
        return num1 * 3.785;
    }

    public double pintToL(double num1){
        return num1 /2.113;
    }

    public double quartToL(double num1){
        return num1 / 1.057;
    }

    public double barrelToL(double num1){
        return num1 * 117;
    }

    public double cubicFootToL(double num1){
        return num1 * 28.317;
    }

    public double cubicInchToL(double num1){
        return num1 / 61.024;
    }

}
