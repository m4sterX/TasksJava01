package by.nkt.java.maspart1;
//14. Дан одномерный массив A[N]. Найти: max( , , , ) min( , , , )
public class N14 {
    public static void main(String[] args) {
        int[] mas = new int[]{2,5,6,89,34,23,56,67,45,32,56,78,3};
        N12.printA(max(mas));
        N12.printA(min(mas));
    }
    public static int max(int[] mas) {
        int max = mas[1];
        for (int i = 3; i < mas.length-1; i++,i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }
    public static int min(int[] mas) {
        int min = mas[0];
        for (int i = 2; i < mas.length; i++,i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }
}
