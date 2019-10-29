package htp.by.nkt.cycle;

public class N20 {
    public static void main(String[] args) {
        int e = 86;
        double sum = 0;
        for (int i = 1; i < e; i++) {
            double a = (double)1 / ((3*i-2) * (3 * i +1));
            if (Math.abs(a) >= e) {
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}
