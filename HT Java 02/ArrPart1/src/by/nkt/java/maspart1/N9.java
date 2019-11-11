package by.nkt.java.maspart1;
// 9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
//элементы.
public class N9 {
    public static void main(String[] args) {
        int[] mas = new int[]{100,290,54,87,190,30,89};
        int[] change = changeOfElement(mas,maxElement(mas),minElement(mas));
        N2.printMas(change);
    }
    public static int maxElement(int[] mas) {
        int max = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = i;
            }
        }
        return max;
    }
    public static int minElement(int[] mas) {
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = i;
            }
        }
        return min;
    }
    public static int[] changeOfElement(int[] mas, int max, int min) {

        int temp = mas[min];
        mas[min] = mas[max];
        mas[max] = temp;

        return mas;
    }
}
