package by.epam.dailid.decomposition.task16;

import java.util.Scanner;

public class Main {
    //Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры. Определить также,
    //сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию
    public static void main(String[] args) {
        int n = getNumber();
        long result = sumOddDigits(n);
        System.out.println("Сумма " + n + "-значных чисел, содержащих только нечетные цифры составила: " + result);
        int evennums = findEvenDigits(result);
        System.out.println("Сумма " + n + "-значных чисел, содержащих только нечетные цифры, содержит "  + evennums +
                " четных цифр(ы)");
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное натуральное число");

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Неверно. Попробуйте еще раз");
        }
        int x = sc.nextInt();

        return x;

    }

    public static int findCounter(int number) {

        int counter = 0;
        while (number != 0) {
            int digit = number % 10;
            counter++;
            number = number / 10;
        }
        return counter;
    }
    public static boolean checkDigitQuantity(int number, int n) {

        if (findCounter(number) == n) {
            return true;
        }
        return false;
    }
    public static boolean findOddDigits(int x) {
        while (x != 0) {
            int digit = x % 10;
            if (digit % 2 == 0) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    public static long sumOddDigits(int x) {

        int i = (int) Math.pow(10, x - 1);
        long sum = 0;
        if (checkDigitQuantity(i, x)) {
        for (; i < (int) Math.pow(10,x); i++) {
            if (findOddDigits(i)) {
                sum += i;
            }
        }
        }
        return sum;
    }
        public static int findEvenDigits(long x){

        int counter = 0;
        while (x != 0 ){
            int test = (int) (x % 10);
            if(test%2==0 && test!=0){
              counter++;
            }
            x /=10;
        }
        return counter;
    }
}

