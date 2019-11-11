package by.nkt.java.maspart1;
// 4. Дана последовательность действительных чисел а1 а2 ,..., аn .
// Выяснить, будет ли она возрастающей.
public class N4 {
    public static void main(String[] args) {
        int[] mas = new int[]{1,2,3,4,5,6,8,10};
        boolean result = checkForIncrease(mas);
        System.out.println("Последовательность возрастает : " + result);

    }
    public static boolean checkForIncrease(int[] mas) {
        boolean result = true;
        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i] > mas[i+1]) {
                 result = false;
                 break;
            }
        }
        return result;
    }
}
