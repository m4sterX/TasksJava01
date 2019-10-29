package htp.by.nkt.cycle;

import java.math.BigInteger;

public class N10 {
    public static void main(String[] args) {
        int i = 1;
        BigInteger mul = new BigInteger("2");
        while (i <= 200) {
            mul = (mul.multiply(mul));
            i++;
            System.out.println(mul);
        }
    }
}
