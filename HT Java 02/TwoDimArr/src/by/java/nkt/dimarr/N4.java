package by.java.nkt.dimarr;
// 4. Дана матрица. Вывести на экран первую и последнюю строки.
public class N4 {
    public static void main(String[] args) {
        int[][] mas = new int[3][3];
        mas = N1.fillMas(mas);
        printM(mas);

    }
    public static void printM(int[][] mas) {
        for (int i = 0; i < mas[0].length; i++) {
            System.out.print(mas[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas[mas.length-1].length; i++) {
            System.out.print(mas[mas.length-1][i] + " ");
        }
    }
}
