package by.java.nkt.dimarr;
// 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число
//7 среди элементов массива.
public class N8 {
    public static void main(String[] args) {
        int[][] mas = new int[][]{{-5,0,89,7,1},{-5,0,89,7,1},{-5,0,89,7,1},{-5,0,89,-7,1},{-5,0,89,7,1}};
        int count = countOfSeven(mas);
        System.out.println(count);
    }
        public static int countOfSeven(int[][] mas) {
        int count = 0;
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    if (mas[i][j] == 7){
                        count++;
                    }
                }
            }
            return count;
        }
}
