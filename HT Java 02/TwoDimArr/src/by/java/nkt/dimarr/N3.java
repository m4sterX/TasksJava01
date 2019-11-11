package by.java.nkt.dimarr;

import java.util.Arrays;

// 3. Дана матрица. Вывести на экран первый и последний столбцы.
public class N3 {
    public static void main(String[] args) {
        int[][] mas = new int[][]{{5,7,3,17},{7,0,1,12},{8,1,2,3}};
        printMas(mas);
    }
    public static void printMas(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++,j++,j++) {
                System.out.print(mas[i][j] + " ");
            }

        }
    }
}
