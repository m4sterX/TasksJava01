package by.nkt.java.decomp;
//14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class N14 {
    public static void main(String[] args) {
    int a = 13456;
    int b = 34567;
    int max;
    int aCount = numOfValue(a);
    int bCount = numOfValue(b);
    String dif = difference(aCount, bCount);
    if(dif.equals("a")) {
        max = a;
    } else if(dif.equals("b")){
        max = b;
    } else {
        System.out.println("they r the same!! please, stop");
        max = 1222333444;
    }
    if(max == 1222333444 ){
        System.exit(0);
    }

    System.out.println("Number " + max + " is longer");
    }

    public static int numOfValue(int a) {
        String s = Integer.toString(a);
        return s.length();
    }

    public static String difference(int a, int b) {
        if (a > b) {
            return "a";
        } else if (a == b) {
            return "they r the same";
        } else {
            return "b";
        }
    }
}