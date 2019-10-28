package by.htp.les01.main;

import java.util.Scanner;

public class N14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a + b >= 180) {
            System.out.println("Такого треугольника не существует");
        } else {
            if (a == 90 || b == 90) {
                System.out.println("треугольник прямоугольный");
            } else {
                System.out.println("трегольник существует, но не прямоугольный");
            }
        }
    }
}