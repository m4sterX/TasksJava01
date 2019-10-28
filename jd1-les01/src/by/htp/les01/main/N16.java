package by.htp.les01.main;

import java.util.Scanner;

public class N16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки : x,y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("Точка находится в начале координат");
        } else if (x == 0 && y != 0) {
            System.out.println("точка лежит на оси Ох");
        } else if (y == 0 && x != 0) {
            System.out.println("точка лежит на оси Оу");
        } else if (x > 0 && y > 0) {
            System.out.println("точка лежит в 1-ой четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("точка лежит в 3-ей четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("точка лежит в 4-ой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("точка лежит во 2-ой четверти");
        }
    }
}
