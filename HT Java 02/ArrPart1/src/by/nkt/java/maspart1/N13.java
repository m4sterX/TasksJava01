package by.nkt.java.maspart1;
// 13. Определить количество элементов последовательности натуральных чисел, кратных
//числу М и заключенных в промежутке от L до N.
public class N13 {
    public static void main(String[] args) {
        int[] mas = new int[]{-2,0,9,4,32,-5,-78,5,3};

        int l = -3;
        int n = 10;
        int m = 3;

        checkForNum(l,n,m,mas);
    }
    public static void checkForNum(int l, int n, int m, int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= l && mas[i] <= n && mas[i] % m == 0) {
                N12.printA(mas[i]);
            }
        }
    }
}
