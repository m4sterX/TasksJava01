package by.htp.les01.main;

import java.util.Scanner;

public class N13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int res1 = x+y;
        int res2 = x1+y1;
        if(Math.abs(res1) > Math.abs(res2)){
            System.out.println("Первая точка ближе к началу координат");
        }else if(Math.abs(res1) < Math.abs(res2)){
            System.out.println("Вторая точка ближе к началу координат");
        }else if(Math.abs(res1) == Math.abs(res2)){
            System.out.println("они равны");
        }
    }
}
