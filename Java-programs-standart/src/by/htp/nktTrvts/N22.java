package by.htp.nktTrvts;

public class N22 {
    public static void main(String[] args) {
        int t = 18907;
        int h = t / 3600;
        double leftSec = t % 3600;
        int m = (int) leftSec / 60;
        int s = (int) leftSec % 60;
        System.out.println("В " + t + " секундах" + " = " + h + " ч " + m + " мин " + s + " сек ");
    }
}
