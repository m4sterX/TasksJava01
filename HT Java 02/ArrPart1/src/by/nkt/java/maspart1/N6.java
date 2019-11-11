package by.nkt.java.maspart1;
// 6. Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси,
//содержащую все эти числа.
public class N6 {
    public static void main(String[] args) {
        int[] mas = new int[]{2,64,43,87,45,21,45,78,103,34};
        int min = minValue(mas);
        int max = maxValue(mas);
        int result = minDistance(min, max);
        System.out.println(result);

    }
    public static int minValue(int[] mas) {
        int minVal = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] < minVal) {
                minVal = mas[i];
            }
        }
        return minVal;
    }
    public static int maxValue(int[] mas) {
        int maxVal = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if(mas[i] > maxVal) {
               maxVal = mas[i];
            }
        }
        return maxVal;
    }
    public static int minDistance(int min, int max) {
        int result = max - min;
        return result;
    }
}
