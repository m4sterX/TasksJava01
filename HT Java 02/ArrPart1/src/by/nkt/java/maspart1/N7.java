package by.nkt.java.maspart1;
// 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
//большие данного Z, этим числом. Подсчитать количество замен.
public class N7 {
    public static void main(String[] args) {
        int z = 35;
        int[] givingMas = new int[]{23,45,75,21,34,90,83,12,32};
        int change = countOfMas(givingMas,z); // changed numbers amount
        int[] mas = getMasWithZ(z,givingMas);
        N2.printMas(mas);
    }
    public static int countOfMas(int[] givingMas, int z) {
        int count = 0;
        for (int i = 0; i < givingMas.length; i++) {
            if (givingMas[i] > z) {
                count++;
            }
        }
        return count;
    }
    public static int[] getMasWithZ(int z, int[] givingMas) {
        for (int i = 0; i < givingMas.length; i++) {
            if (givingMas[i] > z){
                givingMas[i] = z;
            }
        }
        return givingMas;
    }
}
