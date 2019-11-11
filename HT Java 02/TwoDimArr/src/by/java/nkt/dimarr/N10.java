package by.java.nkt.dimarr;
// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class N10 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{5,7,3,17},{7,0,1,12},{8,1,2,3},{78,0,5,6},{0,23,5,4},{6,98,4,23}};

        int k = 3;
        int r = 2;

        returnLine(arr,k);
        System.out.println();
        returnColumn(arr, r);
    }
    public static void returnLine(int[][] arr, int k) {
        int[] arr1;
        for (int i = 0; i < arr.length; i++) {
            if(i == k){
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void returnColumn(int[][] arr, int r) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][r] + " ");
        }
    }
}
