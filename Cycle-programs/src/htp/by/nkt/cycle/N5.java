package htp.by.nkt.cycle;

public class N5 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 99) {
            if (i % 2 != 0){
                sum = sum + i;
                i++;
                System.out.println(sum);
            } else {
                i++;
            }
        }
    }
}
