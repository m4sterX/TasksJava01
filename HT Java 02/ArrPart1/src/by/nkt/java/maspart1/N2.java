package by.nkt.java.maspart1;
//2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров
//этих элементов.
public class N2 {
    public static void main(String[] args) {
        int[] mas = new int[]{2,5,6,0,76,43,0,35,23,0,0};
        int[] masOfZero = new int[zeroCount(mas)];
        masOfZero = initMasOfZero(mas,masOfZero);
        printMas(masOfZero);

    }
    public static int zeroCount(int[] mas) {
        int countOfZero = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                countOfZero++;
            }
        }
        return countOfZero;
    }
    public static int[] initMasOfZero(int[]mas, int[]masOfZero) {
        for (int i = 0, j = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                masOfZero[j] = i;
                j++;
            }
        }
     return masOfZero;
    }
    public static void printMas(int[] masOfZero) {
        for (int i = 0; i < masOfZero.length; i++) {
            System.out.println(masOfZero[i]);
        }
    }
}
