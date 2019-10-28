package by.htp.les01.main;

import java.util.Scanner;

public class N40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        double x = sc.nextDouble();
        double y;
        if (x <= 13) {
            y = -Math.pow(x,3) + 9;
        } else {
            y = -(3 / (x + 1));
        }
        System.out.println("y = " + y);
    }
}
