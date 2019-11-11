package by.nkt.java.maspart1;
// 15. Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать те ее элементы,
//которые принадлежат отрезку [с, d].
public class N15 {
    public static void main(String[] args) {
        int[] line = new int[]{-5,10};
        int[] mas = new int[]{23,-5,65,10,0,-4,5,9,24};
        elementOfLine(line,mas);
    }
    public static void elementOfLine(int[] line,int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] >= line[0] && mas[i] <= line[1]) {
                N12.printA(mas[i]);
            }
        }
    }
}
