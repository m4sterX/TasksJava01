package by.nkt.java.decomp;
//16. Два простых числа называются «близнецами»,
// если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n],
// где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.
public class N16 {
    public static void main(String[] args) {

        int n = 41;
        pair(n);

    }
    public static void pair(int n) {

        int[] size = new int[2];
        size[0] = n;
        size[1] = n * 2;

        for (int i = 2, j = 0; size[1] > n + i; i+=2,j+=2) {

            int[] pair = new int[]{n + j, n + i};
            N13.printMas(pair);
        }
    }
}
