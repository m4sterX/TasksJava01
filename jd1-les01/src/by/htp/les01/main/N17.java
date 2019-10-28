package by.htp.les01.main;

import java.util.Scanner;

public class N17 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max;
        if (a == b) {
            a = 0;
            b = 0;
            System.out.println(a + " " + b);
        } else {
            if (a > b) {
                max = a;
                b = max;
                System.out.println(a + " " + b);
            } else {
                max = b;
                a = max;
                System.out.println(a + " " + b);
            }
        }
    }
}
