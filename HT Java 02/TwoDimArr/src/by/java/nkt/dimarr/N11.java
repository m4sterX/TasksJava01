package by.java.nkt.dimarr;
// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
//строка справа налево, вторая строка слева направо, третья строка справа налево и так
//далее.
public class N11 {

    private static int q = 0;

    public static void main(String[] args) {

        int[][] arr = new int[][]{{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}, {78, 0, 5, 6}, {0, 23, 5, 4}, {6, 98, 4, 23}};

        init(arr);

    }

    public static void printArrStandart(int[][] arr, int q) {
        System.out.println();
            for (int j = 0; j < arr[q].length; j++) {
                System.out.print(arr[q][j] + " ");
        }
    }
    public static void printArrRevers(int[][] arr, int q) {
        System.out.println();
        for (int j = arr[q].length-1; j >= 0; j--) {
            System.out.print(arr[q][j] + " ");
        }
    }

    public static void init(int[][] arr) {
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            if (b) {
                printArrRevers(arr, q);
                q++;
                b = false;
            } else {
                b = true;
            printArrStandart(arr,q);
            q++;
            }
        }
    }
}
