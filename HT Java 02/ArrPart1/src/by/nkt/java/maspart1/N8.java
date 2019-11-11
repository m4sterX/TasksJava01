package by.nkt.java.maspart1;
// 8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем
//отрицательных, положительных и нулевых элементов.
public class N8 {
    public static void main(String[] args) {
        int[] mas = new int[]{10,-5,20,40,-4,0,0,8,-12,0};
        int pos = amountOfPositive(mas);
        int neg = amountOfNegative(mas);
        int zero = amountOfZero(mas);
        System.out.println("pos "+ pos +'\n' + "neg " + neg +'\n' + "zero " + zero);
    }
    public static int amountOfPositive(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public static int amountOfNegative(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                count++;
            }
        }
        return count;
    }
    public static int amountOfZero(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
