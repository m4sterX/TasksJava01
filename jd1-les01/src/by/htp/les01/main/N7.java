package by.htp.les01.main;

public class N7 {
    public static void main(String[] args) {
        double a = Math.random()*100;
        double b = Math.random()*100;
        double c = Math.random()*100;
        double x = Math.random()*1000;
        double y;
        y = a * x * x + b * x + c;
        int result = (int) Math.abs(y);

        System.out.println(result);
    }
}
