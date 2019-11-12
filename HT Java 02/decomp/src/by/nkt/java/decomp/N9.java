package by.nkt.java.decomp;
//9. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑎/𝑐∗𝑏/𝑑−𝑎*𝑏−𝑐/𝑐*𝑑
public class N9 {

    public static void main(String[] args) {

        double a = 6;
        double b = 8;
        double c = 45;
        double d = 23;

        System.out.println(expression(a,b,c,d));
    }

    public static double expression(double a, double b , double c ,double d) {

        return a / c * b / d - ((a * b - c) / c * d);
    }
}
