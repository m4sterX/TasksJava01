package by.java.nkt.mas2;
// 7. Пусть даны две неубывающие последовательности действительных чисел
//n m a  a  a и b  b  b 1 2 1 2
//. Требуется указать те места, на которые нужно вставлять
//элементы последовательности m b  b  b 1 2 в первую последовательность так, чтобы новая
//последовательность оставалась возрастающей.
public class N7 {
    public static void main(String[] args) {
        int[] a1 = new int[] {10, 13, 14, 20, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] a3 = new int[a1.length + a2.length];

        int i=0, j=0;
        for (int k=0; k<a3.length; k++) {

            if (i > a1.length-1) {
                int a = a2[j];
                a3[k] = a;
                j++;
            }
            else if (j > a2.length-1) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else if (a1[i] < a2[j]) {
                int a = a1[i];
                a3[k] = a;
                i++;
            }
            else {
                int b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        Print.masAsLine(a3);
    }
}
