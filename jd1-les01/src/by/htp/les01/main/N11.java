package by.htp.les01.main;

import java.util.Scanner;

public class N11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону и высоту первого треугольника");
        int a1 = sc.nextInt();
        int h1 = sc.nextInt();
        System.out.println("Введите А и H второго тр");
        int a2 = sc.nextInt();
        int h2 = sc.nextInt();
        double s1 = (double)a1*h1/2;
        double s2 = (double)a2*h2/2;
        if(s1>s2){
            System.out.println("площ первого тр = " + s1 + " >" + " площ второго тр = " + s2);
        } else if(s1<s2){
            System.out.println("площ первого тр = " + s1 + " <" + " площ второго тр = " + s2);
        } else{
            System.out.println("Они равны(");
        }
    }
}
