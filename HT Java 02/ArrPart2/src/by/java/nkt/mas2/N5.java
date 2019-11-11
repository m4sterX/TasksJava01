package by.java.nkt.mas2;

import java.util.Arrays;

// 5. Сортировка вставками. Дана последовательность чисел
//n a ,a , ,a 1 2  . Требуется
//переставить числа в порядке возрастания. Делается это следующим образом. Пусть
//i a ,a , ,a 1 2  - упорядоченная последовательность, т. е. n a  a  a 1 2 . Берется следующее
//число 1+ i a и вставляется в последовательность так, чтобы новая последовательность была
//тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n не
//будут перебраны. Примечание. Место помещения очередного элемента в отсортированную
//часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде
//отдельной функции.
public class N5 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
