package by.nkt.java.maspart1;
// 11. Даны натуральные числа а1 ,а2 ,..., аn .
// Указать те из них, у которых остаток от деления
//на М равен L (0 < L < М-1).
public class N11 {
    public static void main(String[] args) {
        int[] mainMas = new int[]{12,90,4,2,89,56,2,4,0};
        int capacity = capacityOfNum(mainMas) ;
        int m = 10;
        int[] resultMas = masOfSpecialNum(capacity,mainMas,m);
        N2.printMas(resultMas);

    }
    public static int[] masOfSpecialNum(int capacity, int[] mainMas, int m) {
        int[] mas1 = new int[capacity];
        for (int i = 0, j = 0; i < mainMas. length; i++) {
            if (mainMas[i] % m > 0 && mainMas[i] % m < m-1) {
                mas1[j] = mainMas[i];
                j++;
            }
        }
        return mas1;
    }
    public static int capacityOfNum(int[] mainMas) {
        int count = 0;
        for (int i = 0; i < mainMas.length; i++) {
            count++;
        }
        return count;
    }
}
