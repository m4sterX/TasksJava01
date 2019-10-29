package htp.by.nkt.cycle;

public class N13 {
    public static void main(String[] args) {
        double y = 0;
        for (int x = -5; x <= 5; x++) {
            y = 5 - Math.pow(x,2) / 2;
            System.out.println("y = " + y + " при x = " + x);
        }
    }
}
