package by.nkt.java.maspart1;
//3. Дана последовательность целых чисел а1 а2,..., аn .
// Выяснить, какое число встречается
//раньше - положительное или отрицательное.
public class N3 {
    public static void main(String[] args) {
        int[] mas = new int[]{-5,4,3,-6,10};
        String answer = checkForTheFirstElement(mas);
        System.out.println(answer);
    }
    public static String checkForTheFirstElement(int[] mas) {
        if (mas[0] < 0){
            return "Negative number";
        } else {
            return "positive number";
        }
    }
}
