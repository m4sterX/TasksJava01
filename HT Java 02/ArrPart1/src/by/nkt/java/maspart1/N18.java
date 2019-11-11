package by.nkt.java.maspart1;

import java.util.Scanner;

// 18*. «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в
//которые надо вставить игральные кубики. Но дверь открывается только в том случае, когда
//в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
//(Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, которая
//разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
public class N18 {
    public static void main(String[] args) {
        int userAnswer = scanInt();
        int userAnswer1 = scanInt();
        int[] mas = new int[]{userAnswer,userAnswer1,0,0,0,0,0,0,0,0};
        int [] newMas = leftToTen(mas);
        N2.printMas(newMas);
        System.out.println("Замок взломан))");

    }
    public static int[] leftToTen(int[] mas) {
        if (mas[1] + mas[0] < 10){
            int change = 10 - (mas[1] + mas[0]);
            mas[2] = change;
            return mas;
        } else {
           int change = 10 - mas[1];
           mas[2] = change - 1;
           mas[3] = 1;
           return mas;
        }
    }
    public static int scanInt() {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Введите положительно число от 1 до 6 включительно!");
            while (!sc.hasNextInt()) {
                System.out.println("Введите, пожалуйста, число");
                sc.next();
            }
            num = sc.nextInt();
        } while (num < 1 ||num > 6);
        System.out.println("Наконец-то");
        return num;
    }
}
