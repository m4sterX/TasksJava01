package htp.by.nkt.cycle;

import java.util.Scanner;

public class N18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double eps = sc.nextDouble();
        int n = 50;
        double sum = 0;

        double[] a = new double[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = (i / (i + 1)) ^ (i + 1);

            if (Math.abs(a[i]) >= eps) {
                sum = sum + a[i];
            }
        }
    }
}