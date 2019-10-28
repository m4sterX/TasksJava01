package by.htp.les01.main;

import java.util.Scanner;

public class N22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // change a to b and vice versa b to a.
        int box;
        box = a;
        a = b;
        b = box;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}