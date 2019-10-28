package by.htp.les01.main;

import java.util.Scanner;

public class N33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();
        // Проверка пренадлежности к группе
        if (userAnswer == 9583 || userAnswer == 1747){
            System.out.println("Отркыт доступ к базе данных: A,B,C");
        } else if (userAnswer == 3331 || userAnswer == 7922){
            System.out.println("Отркыт доступ к базе данных: B,C");
        } else if (userAnswer == 9455 || userAnswer == 8977){
            System.out.println("Отркыт доступ к базе данных: C");
        }
    }
}
