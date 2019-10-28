package by.htp.les01.main;

import java.util.Scanner;

public class N18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int value = 0;
        if (a < 0) {
            value++;
        } else if (b < 0) {
            value++;
        } else if (c < 0) {
            value++;
        }
        System.out.println(value);
    }
}
