package by.htp.nktTrvts;

public class N32 {
    public static void main(String[] args) {
        int m = 22; // now hours
        int n = 36; // now min
        int k = 20; // now seconds
        int p = 8, q = 35, r = 3; // p = users ent hours   q = users ent min  r = user^s entered sec
        int maxh = 24;
        int maxm = 60;
        int maxs = 60;
        int resultHours;
        int resultMin;
        int resultSec;
        if (m + p > 23) {
            int a = maxh - m; // left hours to 24
            resultHours = p - a; // hours after 24 left
        } else {
            resultHours = m + p;
        }
        if (q + n > 59) {
            int a = maxm - n;
            resultMin = q - a;
        } else {
            resultMin = q;
        }
        if (r + k > 59) {
            int a = maxs - k;
            resultSec = r - a;
        } else {
            resultMin = r;
        }
    }
}
