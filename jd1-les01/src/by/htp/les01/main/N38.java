package by.htp.les01.main;

import java.util.Scanner;

public class N38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double y;
        if (x >= 0 && x <= 3) {
            y = x*x;
        } else {
            y = 4;
        }
        System.out.println("y = " + y);
    }
}
