package by.htp.les01.main;

import java.util.Scanner;

public class N26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum;
        int max;
        int min;
        if (a > b) {
            if (a > c) {
                max = a;
                min = Math.min(b, c);
            } else {
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                min = Math.min(a, c);
            } else {
                max = c;
                min = a;
            }
        }
        sum = min + max;
        System.out.println(sum);
    }
}
