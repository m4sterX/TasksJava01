package by.nkt.java.decomp;
// 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его
//площади.

public class N1 {
    public static void main(String[] args) {

        double x1 = 5;
        double y1 = 15;
        double x2 = 5;
        double y2 = 5;
        double x3 = 10;
        double y3 = 5;

        double result = getS(x1,y1,x2,y2,x3,y3);
        System.out.println(result);
    }

    public static double getS(double x, double y, double xy, double yx, double z, double z1) {

        double ab = Math.sqrt(Math.pow(xy - x, 2) + Math.pow(yx - y, 2));
        double bc = Math.sqrt(Math.pow(z - xy, 2) + Math.pow(z1 - yx, 2));
        double ac = Math.sqrt(Math.pow(x - z, 2) + Math.pow(y - z1, 2));

        double p2 = (ab + bc + ac) / 2;
        return Math.sqrt(p2 * (p2 - ab) * (p2 - bc) * (p2 - ac));
    }
}
