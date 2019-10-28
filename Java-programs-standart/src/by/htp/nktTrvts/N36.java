package by.htp.nktTrvts;


public class N36 {
    public static void main(String[] args) {
        int a = 4356;
        double x1 = 0; // четное
        double x2; // нечетное
        double y1;
        double y2;
        double first = a % 10;
        double c = a - first;
        double d = (c % 100);
        double second = d / 10;
        c = a - first - d;
        double f = c % 1000;
        double third = f / 100;
        c = a - first - d - f;
        double fourth = c / 1000;

        double sum = GetNum(first) + GetNum(second) + GetNum(third) + GetNum(fourth);
    }
    public static double GetNum(double z) {
        if (z % 2 == 0) {
             return z;
        } else {
            return 0;
        }
    }
}
