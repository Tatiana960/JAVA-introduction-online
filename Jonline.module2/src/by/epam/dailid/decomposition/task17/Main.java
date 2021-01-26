package by.epam.dailid.decomposition.task17;

public class Main {
    //Из заданного числа вычли сумму его цифр, потом еще раз. Сколько таких действий надо произвести, чтобы получился
    // нуль? Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        int a = 123456789;
        int test = getModule(a);
        int sum = sumOfDigits(test);
        int result = numberOFIterations(a,sum);
        System.out.println(result);
    }

    public static int getModule(int z) {
        int result = Math.abs(z);
        return result;
    }

    public static int sumOfDigits(int x) {
        int res = 0;
        while (x > 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public static int numberOFIterations(int z, int w) {
        int count = 0;
        while (z > 0) {
            z -= w;
            count++;
        }
        return count;
    }

}
