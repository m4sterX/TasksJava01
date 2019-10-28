package by.htp.nktTrvts;

public class N37 {
    public static void main(String[] args) {
        int n = 53;
        //
        // №1
        //
        if (n < 100 && n >= 10 && n % 2 ==0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        // №2
        //
        int a = 4357;
        double first = a % 10;
        double c = a - first;
        double d = (c % 100);
        double second = d / 10;
        c = a - first - d;
        double f = c % 1000;
        double third = f / 100;
        c = a - first - d - f;
        double fourth = c / 1000;
        if (fourth + third == second + first) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        // №3
        //
        if (second + third + fourth % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        // №4
        //
        int x1 = 5;
        int y1 = 6;
        int m = 30;
        int mn = 35;
        if (x1 > m && x1 < mn){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        // №5
        //
        int fxx = 357;
        int frst = fxx / 100;
        int thrd = fxx % 10;
        int secnd = (fxx - thrd) % 100 / 10;
        if (Math.pow(fxx,2) == Math.pow(frst + secnd + thrd,3)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        // №6
        //
        int ab = 5;
        int bc = 5;
        int ac = 6;
        if (ab == bc && bc != ac) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        // №7
        //
        if (frst + secnd == thrd) {
            System.out.println(true);
        } else if (
                frst + thrd == secnd
        ) {
            System.out.println(true);
        } else if (secnd + thrd == frst){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //
        //№8
        //
        int q = 3;
        int qx = 16;
        int result = 0;
        for (int i = 1; i <= q; i++) {
            int reslt = qx % 2;
            if (result != 0){
               if (i == q){
                   System.out.println(false);
               } else {
                   System.out.println(true);
               }
            }
        }
        //
        //№9
        //   //double y = a * x * x + b * x + c;
        int firstm = 5;
        int firstn = 6;
       int aMN = 8;
       int bMN = -5;
       int cMN = 7;
       double dMN = Math.pow(bMN,2) - 4 * aMN * cMN;
       double x1MN = (-bMN + Math.sqrt(dMN)) / 2 * aMN;
       double x2MN = (-bMN - Math.sqrt(dMN)) / 2 * aMN;
       if (firstm > x1MN || firstn > x2MN) {
           System.out.println(false);
       } else {
           System.out.println(true);
       }
    }
}
