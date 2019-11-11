package by.nkt.java.maspart1;
// 20. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него
//каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
//Дополнительный массив не использовать.
public class N20 {
    public static void main(String[] args) {
        int[] mas = new int[]{10,34,56,32,67,1,4,6,54,8};
        mas = changeMasWithZero(mas);
        N2.printMas(mas);
    }
    public static int[] changeMasWithZero(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            if (i % 2 != 0){
                mas[i] = 0;
            }
        }
        return mas;
    }
}
