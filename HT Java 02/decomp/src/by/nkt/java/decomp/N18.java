package by.nkt.java.decomp;
//18. Найти все натуральные n-значные числа,
// цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class N18 {
    public static void main(String[] args) {
        int n = 4; // n-значные
        findIncreasedNum();
    }
    public static void findIncreasedNum() {

        for (int i = 1000; i < 10000 ; i++) {
            if(initOfNum(i) == true){
                printNum(i);
            }
        }
    }

    public static void printNum(int num) {
        System.out.println(num);
    }
    public static boolean initOfNum(int num) {
        int[] mas = new int[4];
        for (int i = mas.length-1; num > 0; num /=10 , i--) {
            mas[i] = num % 10;
        }
        int i = 0;
            if (mas[i] == mas[i + 1] + 1 && mas[i+1] == mas[i+2]+1 && mas[i+2] == mas[i+3]+1) {
                return true;
            } else {
                return false;
            }
        }
    }
