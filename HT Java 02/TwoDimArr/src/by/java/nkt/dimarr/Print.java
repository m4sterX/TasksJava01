package by.java.nkt.dimarr;

public class Print {
    public static void masMasAsLine(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println();
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
        }
    }
}
