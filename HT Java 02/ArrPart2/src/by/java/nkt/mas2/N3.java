package by.java.nkt.mas2;
//3. Сортировка выбором. Дана последовательность чисел n a a a     1 2 .Требуется
//переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве,
//начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый
//- на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать
//алгоритм сортировки выбором.
public class N3 {
    public static void main(String[] args) {
     int[] mas = new int[]{10,23,45,67,43,0,98,56,3};
     sort(mas);
     Print.masAsLine(mas);
    }
    public static void sort(int[] arr) {
        for (int max = 0; max < arr.length - 1; max++) {
            int least = max;
            for (int j = max + 1; j < arr.length; j++) {
                if (arr[j] > arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[max];
            arr[max] = arr[least];
            arr[least] = tmp;
        }
    }
}
