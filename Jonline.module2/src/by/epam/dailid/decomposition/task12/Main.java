package by.epam.dailid.decomposition.task12;

import java.util.Scanner;

public class Main {
    //Даны натуральные числа K и N. Написать метод (методы) формирования массива A, элементами которого являются
    // числа, сумма цифр которых равна K и которые не больше N.
    public static void main(String[] args) {
        int k = getNums();
        int n = getNums();
        int counter = findLengthOfArray(n, k);
        int[] array = fillArray(k, n, counter);
        printArray(array);
    }

    public static int getNums() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное положительное число");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Неверно, попробуйте еще раз");
        }
        int n = sc.nextInt();
        return n;
    }
    public static boolean isNumber(int sum, int k){
        if(sum==k){
            return true;
        }
        return false;
    }

    public static int sumOfDigits(int j){
        int test = 0;
        int sum = 0;
        while (j > 0){
            test = j%10;
            j/=10;
            sum +=test;
        }
        return sum;
    }

    public static int findLengthOfArray(int n, int k){
        int counter = 0;
        int sum = 0;
        int test = 0;

            for(int j = 0; j <=n;j ++){
                sum =sumOfDigits(j);
                if(isNumber(sum,k)){
                    counter++;
                }
            }

        return counter;
    }

    public static int [] fillArray(int k, int n, int counter) {
        int array[] = new int[counter];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n; j++) {
                sum = sumOfDigits(j);
                if (isNumber(sum, k)) {
                   array[i] = j;
                   i++;
                }
            }
        }
        return array;
    }

    public static void printArray(int []array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}

