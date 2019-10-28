package by.htp.nktTrvts;

public class N35 {
    public static void main(String[] args) {
        int m = 333;
        int v = 25;
        double c = (double) m/v;
        int a = (int)c % 10;
        System.out.println(c);
        System.out.println(a); //наименьшая целой части
        int b = (int)c;
        double max = c - b;
        double y =  max * 10;
        int res =(int) y;
        System.out.println(res);
        double finalRes = (double)a / res;
        System.out.println(finalRes); // m/d
    }
}
