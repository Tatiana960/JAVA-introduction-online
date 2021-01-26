package by.epam.student.dailid.module2.task6;

public class Main {
    //Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    //являются простыми числами
    public static void main(String[] args) {
        double a[] = new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10, 11.11, 12.12};
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(i)) {
                sum += a[i];
            }
        }
        System.out.println("Summ: " + sum);

    }

    public static boolean isPrime ( int x){
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}