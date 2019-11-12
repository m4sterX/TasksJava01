package by.nkt.java.decomp;
//19. Написать программу, определяющую сумму n - значных чисел,
// содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме.
// Для решения задачи использовать декомпозицию.
public class N19 {
    public static void main(String[] args) {
        int n = 1379;
        String s = Integer.toString(n);
        int[] a = new int[s.length()];
        int[] b = N13.getM(n,a);
        boolean negativeNum = initializeOfNum(b);

        if (negativeNum == true) {
            int result = returnSum(b);
            int nOfPos = numOfPositive(result);
            System.out.println("Сумма = " + result + '\n' + "Четных цифр в сумме = " + nOfPos);
        } else {
            System.out.println("Данное число содержит четные цифры");
        }


    }
    public static boolean initializeOfNum(int[] b) {
        boolean res = true;
        for (int i = 0; i <b.length ; i++) {
            if(b[i] % 2 == 0) {
             res = false;
             break;
            }

        }
        return res;
    }

    public static int returnSum(int[] b){
        int sum = 0;
        for (int i = 0; i < b.length; i++){
            sum = sum + b[i];
        }
        return sum;
    }
    public static int numOfPositive(int result){

        int nOfPos = 0;
        String s = Integer.toString(result);
        int[] b = new int[s.length()];
        int[] a = N13.getM(result,b);

        for (int i = 0; i < a.length; i++) {

            if(a[i] % 2 == 0 && a[i] != 0){
            nOfPos++;
            }
        }
        return nOfPos;
    }
}
