package by.nkt.java.decomp;
//17. Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.


public class N17 {
    public static void main(String[] args) {
     int k = 200;
     boolean[] masOfArmstrong = new boolean[k];
     masOfArmstrong = initOfMainMas(masOfArmstrong);
     printBooleanMas(masOfArmstrong);

    }
    public static boolean armstrongOrNot(int num) {
        String countOfMas = Integer.toString(num);
        int realNum = num;
        int sum = 0;

        int[] masOfNum = new int[countOfMas.length()];

        for (int i = 0; num > 0; num/= 10) {
            masOfNum[i] = num % 10;
            i++;
        }
        for (int i = 0; i < masOfNum.length; i++) {
            sum = sum + masOfNum[i];
        }
        if (Math.pow(sum,countOfMas.length()) == realNum) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean[] initOfMainMas(boolean[] masOfArmstrong) {
        for (int i = 0; i < masOfArmstrong.length; i++) {
            masOfArmstrong[i] = armstrongOrNot(i);
        }
        return masOfArmstrong;
    }
    public static void printBooleanMas(boolean[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " - " + (i + 1));
        }
    }
}