package by.htp.les01.main;

public class N8 {
    public static void main(String[] args) {
        double a = Math.random()*100;
        double b = Math.random()*100;
        if(Math.sqrt(a)<Math.sqrt(b)){
            System.out.println(a + " < " + b);
        }else{
            System.out.println((a + " > " + b));
        }
    }
}
