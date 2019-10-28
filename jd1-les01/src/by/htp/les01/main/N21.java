package by.htp.les01.main;

import java.util.Scanner;

public class N21 {
    public static void main(String[] args) {
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.next();
        if(userAnswer.equals("Д")){
            System.out.println("Мне нравятся девочки!");
        } else if(userAnswer.equals("М")){
            System.out.println("Мне нравятся мальчики!");
        } else{
            System.out.println("Введите М или Д");
        }
    }
}
