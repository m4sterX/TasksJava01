package by.nkt.java.maspart1;
// 12. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
//порядковые номера которых являются простыми числами.
public class N12 {
    public static void main(String[] args) {
        int[] mas = new int[]{2,3,5,7,8,90,56,71,77,37};
        checkMas(mas);
    }
    public static void printA(int num) {
        System.out.println(num);
    }
    public static void checkMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if(checkNum(mas[i])) {
                printA(mas[i]);
            }
        }
    }
    public static boolean checkNum(int num) {
        if (num < 2){
            return false;
        }
        double s = Math.sqrt(num);
        for (int i = 2; i < s; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
