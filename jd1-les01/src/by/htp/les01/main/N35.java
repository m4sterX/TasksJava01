package by.htp.les01.main;

import java.util.Scanner;

public class N35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();
        if (userAnswer > 366 || userAnswer < 1) {
            System.out.println("Такого дня не существует");
            System.exit(0);
        }
        int month;
        int date;
        if (userAnswer <= 31) {
            System.out.println("январь " + userAnswer + " число");
        } else {
             month = FindMonth(userAnswer);
             date = FindDate(userAnswer);
            System.out.println("Дата - " + date + " Месяц - " + month);
        }
    }

    public static int FindMonth(int a) {
        return a / 31 + 1;
    }
    public static int FindDate(int a){
        return a % 31;
    }
}
