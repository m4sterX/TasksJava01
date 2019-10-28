package by.htp.nktTrvts;

public class N38 {
    public static void main(String[] args) {
        ///
        /// № b
        ///
        int x = 3;
        int y = -1;
        boolean res = Sqrt(3,-1);
        System.out.println(res);
        ///
        /// № c
        ///


    }
    public static boolean Sqrt(int x1,int y1) {
        if (x1 <= 2 && y1 <= 4 && x1 >= -2 && y1 >=0) {
           return true;
        } else {
            if (x1 <= 4 && y1 <= 0 && x1 >= -4 && y1 >= -3) {
               return true;
            } else {
                return false;
            }
        }
    }
}
