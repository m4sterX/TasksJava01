package by.java.nkt.dimarr;
// 7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
//элементов.
public class N7 {
    public static void main(String[] args) {
        int[][] mas = new int[][]{{-5,0,89,-7,1},{-5,0,89,-7,1},{-5,0,89,-7,1},{-5,0,89,-7,1},{-5,0,89,-7,1}};
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < 0 && mas[i][j] % 2 != 0){
                    sum = sum + Math.abs(mas[i][j]);
                }
            }
        }
        System.out.println(sum);
    }
}
