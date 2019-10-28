package by.htp.les01.main;

import java.util.Scanner;

public class N24 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во лепестков");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Не любит((");
        } else {
            System.out.println("Любит!");
        }
    }
}
