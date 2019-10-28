package by.htp.les01.main;

import java.util.Scanner;

public class N27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min1, min2, max;
        min1 = Math.min(a, b);
        min2 = Math.min(c, d);
        max = Math.max(min1, min2);
        System.out.println(max);
    }
}
