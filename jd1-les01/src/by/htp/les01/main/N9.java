package by.htp.les01.main;

import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println("triangle is equilateral");
        } else {
            System.out.println("No))");
        }
    }
}

