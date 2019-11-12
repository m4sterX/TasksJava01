package by.nkt.java.decomp;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
//общего кратного двух натуральных чисел:

public class N2 {
    public static void main(String[] args) {

        double a = 72;
        double b = 45;

        double result = nok(a,b);
        System.out.println(result);
    }
    public static double nod(double a, double b){
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
           return b;
        } else {
            return a;
        }
    }
    public static double nok(double a,double b) {
        return a * b / nod(a, b);

    }
}
