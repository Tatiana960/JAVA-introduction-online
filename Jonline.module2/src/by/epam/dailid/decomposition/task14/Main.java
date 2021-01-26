package by.epam.dailid.decomposition.task14;

import java.util.Scanner;

public class Main {
    //Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенных
    // в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
    public static void main(String[] args) {
        int k = getNumber();
        getnumberArmstrong(k);
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное положительное число: ");
        String str;
        int a;
        while (!sc.hasNextInt()) {
            str = sc.nextLine();
            System.out.println("Некорректный ввод, попробуйте еще раз");
        }
        a = sc.nextInt();
        return a;
    }

    public static void getnumberArmstrong(int x ) {
        int result = 0;
        for (int i = 1; i < x; i++) {
            if (isnumberArmstrong(i)) {
                System.out.println(i);
            }
        }

    }
        public static int findDigit ( int x){

            int count = 0;
            while (x > 0) {
                x /= 10;
                count++;
            }
            return count;
        }


    public static boolean isnumberArmstrong(int x) {

        int num = findDigit(x);
        int digit = 0;
        double result = 0;
        int comp = x;
        while (comp > 0) {
            digit = comp % 10;
            comp /= 10;
            result += Math.pow(digit, num);
        }

        if (result == x) {
            return true;

        }
        return false;
    }

    }





