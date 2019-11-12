package by.nkt.java.decomp;

// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.

public class N11 {

    public static void main(String[] args) {

        double a = 6;
        double b = 10;

        double gp = gpOfTriangle(a,b);

        double p = pOfTriangle(a,b,gp);

        double s = sOfTriangle(a ,b);

        System.out.println("периметр = " + p +'\n' + "площадь = " + s );

    }

    public static double sOfTriangle(double a, double b) {
        return 1.0/2 * a * b;


    }

    public  static double pOfTriangle(double a, double b, double c) {
        return a + b + c;
    }

    public static double gpOfTriangle(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}
