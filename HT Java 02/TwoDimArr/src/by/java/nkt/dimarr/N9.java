package by.java.nkt.dimarr;
// 9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class N9 {
    public static void main(String[] args) {
        int[][] mas = new int[][]{{-5,0,89,7,1},{-5,0,89,7,1},{-5,0,89,7,1},{-5,0,89,-7,1},{-5,0,89,7,100}};
        for (int i = 0, j = 0; i < mas.length; i++) {
            System.out.println(mas[i][j]);
            j++;
        }
    }
}
