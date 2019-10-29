package htp.by.nkt.cycle;

public class N17 {
    public static void main(String[] args) {
        int a = 2;
        int n = 6;
        int sum = 2;
        for (int i = 1; i < n; i++) {
            sum = sum * (a + i);
        }
        System.out.println(sum);
    }
}
