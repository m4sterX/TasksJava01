package by.nkt.java.decomp;

import java.util.Scanner;

//6. Вычислить площадь правильного шестиугольника со стороной а, используя метод
//вычисления площади треугольника.

public class N6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(getS(a));
    }
    public static double getS(int a) {
        return (3 * Math.sqrt(3) * Math.pow(a,2))/2;
    }
}
