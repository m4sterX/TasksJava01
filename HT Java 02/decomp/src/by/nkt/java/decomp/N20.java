package by.nkt.java.decomp;
//20. Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?
// Для решения задачи использовать декомпозицию.
public class N20 {
    public static void main(String[] args) {
        int number = 1234;
        int res =main1(number);
        printl(res);

    }
    public static int[] countOfNumAndCreateMas(int number) {
        String str = Integer.toString(number);
        int count = str.length();
        int[] mas = new int[count];
        return mas;
    }
    public static int initOfCountOfNumMasAndSum(int[] countMas, int number) {
        int sum = 0;
        for (int i = 0; number > 0; number/=10, i++) {
            countMas[i] = number % 10;
        }
        for (int i = 0; i <countMas.length; i++) {
            sum = sum + countMas[i];
        }
        return sum;
    }
    public static int decreaseAndGiveResult(int decreasedFor,int numberThatDecreased) {
        int resultOFDecreasing = numberThatDecreased - decreasedFor;
        return resultOFDecreasing;
    }
    public static int repeatingMethod(int number) {
        int[] countOfNumMas = countOfNumAndCreateMas(number);
        int sum = initOfCountOfNumMasAndSum(countOfNumMas,number);
        int resultOfDecreasing = decreaseAndGiveResult(sum,number);
        return resultOfDecreasing;
    }
    public static int main1(int number) {
        int count = 0;
        for (int i = 0; number > 0; i++) {
            number = repeatingMethod(number);
            count++;
        }
        return count;
    }
    public static void printl(int count) {
        System.out.println(count);
    }
}
