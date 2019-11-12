package by.nkt.java.decomp;
//5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

public class N5 {
    public static void main(String[] args) {

        int[] mas = {10,5,7};
        System.out.println(getSum(mas));
    }
    public static int getSum(int[] mas) {

        int max = Math.max(mas[0],Math.max(mas[1],mas[2]));
        int min = Math.min(mas[0],Math.min(mas[1],mas[2]));
        return max + min;
    }
}
