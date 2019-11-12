package by.nkt.java.decomp;
//10. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡𝑔 𝑥𝑦
public class N10 {

    public static void main(String[] args) {

        double x = 0.5;
        double y = 2.5;

        System.out.println(expression(x,y));
    }

    public static double expression(double x, double y) {

        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
