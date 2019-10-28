package by.htp.les01.main;

import java.util.Scanner;

public class N23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        int usersDate = sc.nextInt();
        if (usersDate > 31 || usersDate < 1){
            System.out.println("Некорректная дата");
            return;
        }
        System.out.println("Введите месяц");
        int usersMonth = sc.nextInt();
        if (usersMonth > 12 || usersMonth < 1){
            System.out.println("Введен несуществующий месяц");
        }
    }
}
