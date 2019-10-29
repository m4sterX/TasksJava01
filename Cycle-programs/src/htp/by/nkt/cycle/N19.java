package htp.by.nkt.cycle;

public class N19 {
    public static void main(String[] args) {
        int e = 86;
        double sum = 0;
        for (int i = 1; i < e; i++) {
            double a = (1 / Math.pow(2,i)) + (1 / Math.pow(3,i));
            if (Math.abs(a) >= e) {
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}
