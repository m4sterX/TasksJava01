package htp.by.nkt.cycle;

import java.util.Scanner;

public class N14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double sum = 0;
        for (double i = 1; i <= a; i++) {
            sum = sum + 1 / i;
            System.out.println(sum);
        }
    }
}
