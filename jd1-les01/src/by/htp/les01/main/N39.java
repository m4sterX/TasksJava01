package by.htp.les01.main;

import java.util.Scanner;

public class N39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double y;
        if (x >= 8) {
            y = x*x + x - 9;
        } else {
            y = 1 / (Math.pow(x,4) - 6);
        }
        System.out.println("y = " + y);
    }
}
