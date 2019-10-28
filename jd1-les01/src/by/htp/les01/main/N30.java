package by.htp.les01.main;

public class N30 {
    public static void main(String[] args) {
        double a = 8.7;
        double b = -5;
        double c = 16;
        if(a > b && b > c){
            a = a*a;
            b = b*b;
            c = c*c;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println(a + " " +  b + " " + c);
    }
}
