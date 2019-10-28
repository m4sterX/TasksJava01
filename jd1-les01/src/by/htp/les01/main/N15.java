package by.htp.les01.main;

import java.util.Scanner;

public class N15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double sum = (double)(a + b)/2;
        double mult = a*b*2;
        if(a<b){
            a = sum;
            b = mult;
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        } else {
            b = sum;
            a = mult;
            System.out.println("b = "+b);
            System.out.println("a = "+a);
        }
    }
}
