package htp.by.nkt.cycle;

import java.math.BigInteger;

public class N11 {
    public static void main(String[] args) {
       double dif = 0;
        for (int i = 1; i <= 199; i++) {
            dif = dif - (Math.pow(i,3) - Math.pow(i+1,3));
            System.out.println(dif);
        }
    }
}
//  BigInteger big = new BigInteger("1");
//        BigInteger raise = new BigInteger("1");
//        BigInteger bigger = new BigInteger("2");
//        BigInteger dif = new BigInteger("0");
//        int i = 1;
//        while (i <= 199) {
//         dif = dif.subtract((big.pow(3).subtract(bigger.pow(3))));
//            big = big.add(raise);
//            bigger = bigger.add(raise);
//            i++;
//            System.out.println(dif);