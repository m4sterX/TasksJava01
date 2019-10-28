package by.htp.les01.main;

import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1R = sc.nextInt();
        double r2R = sc.nextInt();
        double R1 = Math.sqrt(r1R)*3.14;
        double R2 = Math.sqrt(r2R)*3.14;
        if(R1>R2){
            System.out.println("Round1 > Round2");
        } else{
            System.out.println("Round2 > Round1");
        }
    }
}
