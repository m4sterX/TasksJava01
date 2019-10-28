package by.htp.les01.main;

public class N29 {
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 4;
        int x2 = 6;
        int y2 = 5;
        int x3 = 5;
        int y3 = 5;
        if (x1 == x2 && x1 == x3) {
            System.out.println(" 3 Точки лежат на осях Ох ");
        } else if (
                x1 == x2 || x2 == x3 || x1 == x3
        ) {
            System.out.println("2 Точки лежат на осях Ох ");
        }
        if (y1 == y2 && y1 == y3) {
            System.out.println(" 3 Точки лежат на осях Оy ");
        } else if (
                y1 == y2 || y2 == y3 || y1 == y3
        ) {
            System.out.println("2 Точки лежат на осях Оy ");
        }
    }
}
