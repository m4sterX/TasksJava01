package by.nkt.java.decomp;
//13. Дано натуральное число N. Написать метод(методы) для формирования массива,
//элементами которого являются цифры числа N.
public class N13 {
    public static void main(String[] args) {

        int n = 1234;
        String s = Integer.toString(n);
        int[] a = new int[s.length()];
        int[] b = getM(n,a);

        printMas(b);
    }
    public static int[] getM(int n, int[] a) {
        for( int i = 0; n > 0 ; n /= 10){


                a[i] = n % 10;
                i++;



        }
        return a;
    }

    public static void printMas(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
