package htp.by.nkt.cycle;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userAnswer = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i < userAnswer){
            sum = sum + i;
            System.out.println("Сумма = " + sum + " пока i = " + i);
            i++;
        }
    }
}
