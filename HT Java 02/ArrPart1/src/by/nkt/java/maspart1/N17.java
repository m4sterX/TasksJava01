package by.nkt.java.maspart1;
// 17. Дана последовательность целых чисел n aaa, , , 1 2  . Образовать новую
//последовательность, выбросив из исходной те члены, которые равны ) , , , min( 1 2 n a a a  .
public class N17 {
    public static void main(String[] args) {
        int[] mas = new int[]{15,3,56,-5,90,45,2,4};
        int amountOfMas = amountOfNewMas(mas);
        int indexOfMin = findMin(mas);
        int[] newMas = newMas(mas,amountOfMas,indexOfMin);
        N2.printMas(newMas);
    }
    public static int amountOfNewMas(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            count++;
        }
        return count-1;
    }
    public static int findMin(int[] mas) {
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min){
                min = i;
            }
        }
        return min;
    }
    public static int[] newMas(int[] mas,int amountOfMas,int indexOfMin) {
        int[] newMas = new int[amountOfMas];
        for (int i = 0, j = 0; i < mas.length; i++) {
            if (i == indexOfMin-1){
                i = i+1;
            }
            newMas[j] = mas[i];
            j++;
        }
        return newMas;
    }
}
