package by.nkt.java.decomp;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех
//натуральных чисел.
public class N3 {
    public static void main(String[] args) {
        int[] nums = {16,8,64,24};

        int gcd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcd = getGcd(gcd,nums[i]);
        }
        System.out.println("gcd is " + gcd);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b,a%b);
    }
}
