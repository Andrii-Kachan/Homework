package logic;

public class LengthLogic {
    public double mToKm(double num1) {
        return num1 / 1000;
    }

    public double mToMile(double num1) {
        return num1 / 1609;
    }

    public double mToNauticalMile(double num1) {
        return num1 / 1852;
    }

    public double mToCable(double num1) {
        return num1 * 0.00539956803455724;
    }

    public double mToLeague(double num1) {
        return num1 / 5556;
    }

    public double mToFoot(double num1) {
        return num1 * 3.281;
    }

    public double mToYard(double num1) {
        return num1 * 1.094;
    }

    public double kmToM(double num1){
        return num1 * 1000;
    }

    public double mileToM(double num1){
        return num1 * 1609;
    }

    public double nauticalMileToM(double num1){
        return num1 * 1852;
    }

    public double cableToM(double num1){
        return num1 / 0.00539956803455724;
    }

    public double leagueToM(double num1){
        return num1 * 5556;
    }

    public double footToM(double num1){
        return num1 / 3.281;
    }

    public double yardToM(double num1){
        return num1 / 1.094;
    }
}

