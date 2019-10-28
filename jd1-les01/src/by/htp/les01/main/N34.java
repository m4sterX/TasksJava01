package by.htp.les01.main;

import java.util.Scanner;

public class N34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость книг : ");
        double bookPrice = sc.nextDouble();
        System.out.println("Введите сумму денег, внесенную покупателем: ");
        double customersMoney = sc.nextDouble();
        System.out.println("Введите валюту: ");
        String money = sc.next();
        if (customersMoney == bookPrice){
            System.out.println("Спасибо за покупку!\n Приходите еще.");
        } else {
            if(customersMoney > bookPrice){
                 double change = customersMoney - bookPrice;
                System.out.println("Ваша сдача составляет: "+ change + " "+ money);
            } else {double change = bookPrice - customersMoney;
                System.out.println("Внесите еще:" + change + " " + money);
            }
        }
    }
}
