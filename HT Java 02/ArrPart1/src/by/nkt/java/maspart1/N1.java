package by.nkt.java.maspart1;
//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
//данному К.

public class N1 {
    public static void main(String[] args) {
        int[] a = new int[]{3,7,5,8,14,67,45,94,25};
        int k = 5;
        int sum = sumOfMas(a,k);
        System.out.println(sum);

    }
    public static int sumOfMas(int[] a, int k) {

        int sum = 0;

        for (int i = 0; i < a.length ; i++) {

            if (a[i] % 5 == 0){
                sum = sum + a[i];
            }
        }
        return sum;
    }

}
