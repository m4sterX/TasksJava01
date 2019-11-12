package by.nkt.java.decomp;
//15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//элементами которого являются числа, сумма цифр которых равна К и которые не большее
//N.
public class N15 {
    public static void main(String[] args) {
    int k = 10;
    int n = 100;
    int[] a = getMas(k,n);
    N13.printMas(a);
        }

    public static int[] getMas(int k, int n) {
        int[] b = new int[k-1];
        for (int g = 0, i = 1, j = 1 ; i < k; i++,j++) {
            int temp = k - i;
            String s = temp + "" + j;
            int num = Integer.parseInt(s);
            b[g] = num;
            g++;
        }
        return b;
    }
}
