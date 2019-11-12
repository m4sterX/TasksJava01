package by.nkt.java.decomp;
// 12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class N12 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 10;

        int result = sOfSq(a,b,c,d);
        System.out.println(result);
    }
    public static int sOfSq(int a, int b , int c, int d) {
        if (a == b) {
           return  a * c;
        }  else {
           return  a * b;
        }

    }
}
