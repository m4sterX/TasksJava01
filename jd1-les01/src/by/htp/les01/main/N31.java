package by.htp.les01.main;

import java.util.Scanner;

public class N31 {
    public static void main(String[] args) {
        System.out.println("Введите параметры отверстия: Х по верт и У по горизонтали");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Задайте параметры кирпича, а именно: длинна ЛИЦЕВОЙ стороны по вертикали и по горизонтали, длинна БОКОВОЙ стороны ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Как вы хотите положить кирпич, выберите номер операции:\n Введите:\n 1, если лицевой стороной меньшим ребром вниз;\n 2, если лицевой стороной, но БОЛЬШИМ ребром вниз;\n 3, если боковой стороной и основанием вниз;\n 4, если боковой стороной и ребром(не сонование вниз)\n 5, если крышей набок (большим ребром вниз);\n 6, если крышей набок(меньшим ребром вниз)");
        int userAnswer = sc.nextInt();
        // Проверка ввода операции
        if (userAnswer > 6 || userAnswer < 1) {
            System.out.println("Неверный ввод. Пожалуйста, выберите номер операции из перечисленных выше и повторите попытку");
            return;
        }
        // Проверка завершена
        //функции пользовательско ввода:
        switch (userAnswer) {
            case 1:
                if (x > b || y > a) {
                    System.out.println("Кирпич не Пройдет");
                } else {
                    System.out.println("Пройдет!");
                }
                break;
            case 2:
                if (x > a || y > b) {
                    System.out.println("Кирпич не Пройдет");
                } else {
                    System.out.println("Пройдет!");
                }
                break;
            case 3:
                if (z > b || y > a) {
                    System.out.println("Кирпич не Пройдет");
                } else {
                    System.out.println("Пройдет!");
                }
                break;
            case 4:
                if (z > a || y > b) {
                    System.out.println("Кирпич не Пройдет");
                } else {
                    System.out.println("Пройдет!");
                }
                break;
            case 5:
                if (x > a || z > b) {
                    System.out.println("Кирпич не Пройдет");
                } else {
                    System.out.println("Пройдет!");
                }
                break;
            case 6:
                if (z > a || x > b) {
                    System.out.println("Кирпич не Пройдет");
                } else {
                    System.out.println("Пройдет!");
                }
                break;
        }
    }
}
