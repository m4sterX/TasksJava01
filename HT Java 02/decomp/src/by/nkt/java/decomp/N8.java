package by.nkt.java.decomp;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2

public class N8 {

    public static void main(String[] args) {

        double a = 10;
        double b = 9;
        double c = 6;

        double result = value(a,b,c);
        System.out.println(result);

    }
    public static double value(double a, double b, double c) {
        return (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / 2 * a - (Math.pow(a,3) * c + Math.pow(b,-2));
    }


}
