package by.java.nkt.dimarr;
// 1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была
//ровно одна единица, и вывести на экран.
public class N1 {
    public static void main(String[] args) {
        int[][] mas = new int[3][4];
        mas = fillMas(mas);

        Print.masMasAsLine(mas);


    }
    public static int[][] fillMas(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++){
            if ( j == 1){
            mas[i][j] = 1;
            }

            }
        }
        return mas;
    }

}
