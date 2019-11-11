package by.nkt.java.maspart1;
// 5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
//чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
public class N5 {
    public static void main(String[] args) {
        int[] givingMas = new int[]{3,9,5,6,23,56,45,89,76,56,42};
        int countOfEvenNumbered = checkForEvenNumbered(givingMas);
        checkAndAnswerIfNotFound(countOfEvenNumbered);
        int[] resultMas = creatingMasOfEvenNumbered(countOfEvenNumbered,givingMas);
        N2.printMas(resultMas);

    }
    public static int checkForEvenNumbered(int[] givingMas) {
        int countOfEvenNumbered = 0;
        for (int i = 0; i < givingMas.length; i++) {
            if (givingMas[i] % 2 == 0){
                countOfEvenNumbered++;
            }
        }
        return countOfEvenNumbered;
    }
    public static void checkAndAnswerIfNotFound(int countOfNum) {
        if(countOfNum == 0){
            System.out.println("Even-numbered is not found. Please, try again with another mas");
            System.exit(0);
        }
    }
    public static int[] creatingMasOfEvenNumbered(int countOfEvenNumbered, int[] givingMas) {
        int[] mas = new int[countOfEvenNumbered];
        for (int i = 0, j = 0; i < givingMas.length; i++) {
            if(givingMas[i] % 2 == 0) {
                mas[j] = givingMas[i];
                j++;
            }
        }
        return mas;
    }
}
