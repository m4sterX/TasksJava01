package by.htp.nktTrvts;

public class N13 {
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 6;
        int x2 = 19;
        int y2 = 67;
        int x3 = 21;
        int y3 = 7;
        double ab = GetCoordinate(x1, y1, x2, y2);
        double bc = GetCoordinate(x2, y2, x3, y3);
        double ac = GetCoordinate(x3, y3, x1, y1);
        double p = ab + bc + ac;
        double p2 = p / 2;
        double s = Math.sqrt(p2 * (p2 - ab) * (p2 - bc) * (p2 - ac));
        System.out.println("Периметр = " + p + "\n" + "Площадь = " + s);
    }

    public static double GetCoordinate(int a, int b, int c, int d) {
        return Math.sqrt(Math.pow(a - c, 2) + Math.pow(b - d, 2));
    }
}
