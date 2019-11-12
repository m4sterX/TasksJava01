package by.nkt.java.decomp;
//4. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class N4 {
    public static void main(String[] args) {
        int[] mas = new int[]{21, 36, 15};
        System.out.println(getNok(mas));
    }

    private static int getNok(int[] mas) {
        boolean b = true;
        int max = Math.max(mas[0], Math.max(mas[1], mas[2]));
        while (b) {
            if (max % mas[0] == 0 && max % mas[1] == 0 && max % mas[2] == 0) {
                return max;
            } else {
                ++max;
            }
        }
        return max;
    }

}
