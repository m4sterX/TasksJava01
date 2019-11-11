package by.nkt.java.maspart1;
// 19. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся
//число. Если таких чисел несколько, то определить наименьшее из них.
public class N19 {

    static int[][] masOfMas = new int[10][1];
    static int numberOfMas = 0;


    public static void main(String[] args) {
        int[] mas = new int[]{25, 0, 89, 54, 25, 75, 89, 45, 2};
        countOfRepeatedNum(mas);
        System.out.println(resultChecker());


    }

    public static void countOfRepeatedNum(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            for (int j = 0; j < mas.length; j++) {

                int num = mas[i];
                if (i == j) {
                    continue;
                }
                if (mas[i] == mas[j]) {
                    count++;
                }
                if (j == mas.length - 1) {
                    masOfMas(createNewObj(num, count));
                }
            }
        }
    }

    public static int[] createNewObj(int num, int count) {
        int[] masWith2Num = new int[2];
        masWith2Num[0] = num;
        masWith2Num[1] = count;
        return masWith2Num;
    }

    public static void masOfMas(int[] masWith2Num) {
        masOfMas[numberOfMas] = masWith2Num;
        numberOfMas++;
    }

    public static int resultChecker() {
        int[] max = new int[2];
        int result = 0;
        for (int i = 0; i < masOfMas.length; i++) {

            if (masOfMas[i][0] > max[0]) {
                max[1] = masOfMas[i][1];
                max[0] = masOfMas[i][0];
            }
            if (masOfMas[i][0] == max[0]) {
                result = Math.min(masOfMas[i][1], max[1]);
            }

        }
        return result;
    }
}
