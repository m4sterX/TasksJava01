package by.java.nkt.mas2;

import java.util.Arrays;

// 4. Сортировка обменами. Дана последовательность чисел
//n a a a     1 2
//.Требуется
//переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
//1+i i a и a . Если 1+  i i a a , то делается перестановка. Так продолжается до тех пор, пока все
//элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки,
//подсчитывая при этом количества перестановок.
public class N4 {
    public static void main(String[] args) {
        int [] mas = {78, 3, 14, 80, 7, 56, 0, 45};
        int count = 0;
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    count++;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(count);
    }
}
