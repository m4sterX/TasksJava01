package by.htp.les01.main;

import java.util.Scanner;

public class N37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double y;
        if (x >= 3) {
            y = -(x*x) + 3*x + 9;
        } else {
            y = 1 / (Math.pow(x,3) - 6);
        }
        System.out.println("y = " + y);
    }
}
