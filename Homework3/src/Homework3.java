public class Homework3 {
    double gravity = 9.81;

    public void shotDegrees(double speed, double angle){

        double distance = (2 * speed * Math.sin(Math.toDegrees(angle))) / gravity;
        System.out.println(distance);
    }

    public void shotRad(double speed, double angle){

        double distance = (2 * speed * Math.sin(Math.toRadians(angle)) / gravity);
        System.out.println(distance);
    }

    public void distance(double speed1, double speed2, double time){

        double distance = Math.abs(speed1 * time + speed2 * time);
        System.out.println(distance);
    }
    private double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    public void isDotInsideArea(double x, double y) {
        double xA = 0, yA = 0, xB = 0, yB = -1, xC = -2, yC = 2, xD = 2, yD = 2;
        double area1 = area(xA, yA, xB, yB, xC, yC);
        double area2 = area(xA, yA, xB, yB, xD, yD);

        double A1 = area(x, y, xB, yB, xC, yC);
        double A2 = area(xA, yA, x, y, xC, yC);
        double A3 = area(xA, yA, xB, yB, x, y);

        double D1 = area(x, y, xB, yB, xD, yD);
        double D2 = area(xA, yA, x, y, xD, yD);
        double D3 = area(xA, yA, xB, yB, x, y);

        int a = 0;

        if ((area1 == A1 + A2 + A3) || (area2 == D1 + D2 + D3)){
            a = 1;
        }
        System.out.println(a);
    }

    public void theEquation(double x){
        double z, z1, z2, z3;

        z1 = 6 * Math.log(Math.sqrt(Math.exp(x + 1) + 2 * Math.exp(x) * Math.cos(Math.toDegrees(x))));
        z2 = Math.log(x - Math.exp(x + 1) * Math.sin(Math.toDegrees(x)));
        z3 = Math.abs(Math.cos(Math.toDegrees(x)) / Math.exp(Math.sin(Math.toDegrees(x))));
        z = z1 / z2 + z3;
        System.out.println(z);
    }



}
