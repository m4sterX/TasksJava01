package by.java.nkt.dimarr;
// 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
//больше последнего.
public class N6 {
    public static void main(String[] args) {
        int[][] mas = new int[][]{{5,7,3,17},{7,0,1,12},{8,1,2,3},{78,0,5,6},{0,23,5,4},{6,98,4,23}};
        for (int i = 1; i < mas.length; i++) {
            if(i % 2 != 0 && mas[i][0] > mas[i][mas[i].length-1]) {
                System.out.println();
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.print(mas[i][j] + " ");
                }
            }
        }
    }
    }

