package by.htp.nktTrvts;

public class N28 {
    public static void main(String[] args) {
        int r = 2;
        double grad = GradtoRad(2);
        double m = 60;
        double s = 3600;
        double min = r * (m * 180)/ 3.14;
        double sec = r * (s * 180)/ 3.14;

    }
    public static double GradtoRad(int a){
        return a * 180 / 3.14;
    }
}
