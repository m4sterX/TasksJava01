package by.htp.nktTrvts;

import java.util.Scanner;

public class N16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();

        System.out.println(ResultOfMul(userAnswer));
    }

    public static int ResultOfMul(int a) {
        double first = a % 10;
        double c = a - first;
        double d = (c % 100);
        double second = d / 10;
        c = a - first - d;
        double f = c % 1000;
        double third = f / 100;
        c = a - first - d - f;
        double fourth = c / 1000;
        int mul = (int) (first * second * third * fourth);
        return mul;
    }
}
