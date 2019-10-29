package htp.by.nkt.cycle;

public class N16 {
    public static void main(String[] args) {
        int fina = 1;
        int temp = 0;
        int checker = 2;
        for (int i = 0; i < 9; i++) {
            temp =0;
            for (int j = 1; j <= checker; j++) {
                temp = temp + j;
            }
            fina = fina * temp;
            checker++;
        }
        System.out.println(fina);
    }
}
