package by.nkt.java.maspart1;
// 16. Даны действительные числа n a ,a , ,a 1 2  . Найти
//max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .
public class N16 {
    public static void main(String[] args) {
        int[] mas = new int[]{12,34,56,23,13,90,6,73,89,55};
        mas = createMas(mas);
        int max = maxMath(mas);


    }
    public static int[] createMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (mas[i] + 1) * 2 * i;
        }
        return mas;
    }
    public static int maxMath(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length-1; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }
}
