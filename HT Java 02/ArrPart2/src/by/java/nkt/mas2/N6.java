package by.java.nkt.mas2;

import java.lang.reflect.Array;
import java.util.Arrays;

// 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его
//по возрастанию. Делается это следующим образом: сравниваются два соседних элемента
//i i+1 a и a . Если
//+1  i i a a , то продвигаются на один элемент вперед. Если +1  i i a a , то производится
//перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
public class N6 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
// Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
// Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                       swap(array,c,c+gap);
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int c, int cgap) {
        int temp = array[c];
        array[c] = array[cgap];
        array[cgap] = temp;

    }
}
