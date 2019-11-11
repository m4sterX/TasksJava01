package by.nkt.java.maspart1;
// 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
public class N10 {
    public static void main(String[] args) {
        int[] mas = new int[]{2,3,4,5,1,90,1};
        int capacity = masCapacity(mas);
        int[] mas1 = masOfSpecialNum(mas, capacity);
        N2.printMas(mas1);
    }
    public static int masCapacity(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                count++;
            }
        }
        return count;
    }
    public static int[] masOfSpecialNum(int[] mas, int capacity) {
        int[] mas1 = new int[capacity];
        for (int i = 0, j = 0; i < mas.length; i++) {
            if (mas[i] > i){
                mas1[j] = mas[i];
                j++;
            }
        }
        return mas1;
    }
}
