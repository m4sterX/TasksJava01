package by.java.nkt.dimarr;
// 5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
public class N5 {
    public static void main(String[] args) {
        int[][] mas = new int[][]{{5,7,3,17},{7,0,1,12},{8,1,2,3},{78,0,5,6},{0,23,5,4},{6,98,4,23}};
        for (int i = 2; i < mas.length; i++) {
            if(i % 2 == 0) {
                System.out.println();
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.print(mas[i][j] + " ");
                }
            }
        }
    }

}
