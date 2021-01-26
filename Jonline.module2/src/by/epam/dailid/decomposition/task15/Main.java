package by.epam.dailid.decomposition.task15;

import java.util.Scanner;

public class Main {
    //Найти все n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5678)
    //Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        int x = 3;// getNumber();
        showArray(x);
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное натуральное число до 9");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Неверно, повторите ввод");
        }
        int number = sc.nextInt();
        return number;
    }



    public static int[] fillArray(int number, int x) {
        int array[] = new int[x];
        for (int i = array.length - 1; i >= 0; i--) {
            if (number != 0) {
                array[i] = number % 10;
                number = number / 10;

            }
        }
        return array;
    }

    public static boolean isNumberIncreasing(int[] array) {
        for (int i = array.length-1; i >=1; i--) {

            if (i -1 == array.length) {
          break;

       }

        if ((array[i] - array[i - 1])== 1) {
            continue;

        }
          return false;
        }
        return true;
    }

    public static int findLengthNewArray(int x) {
        int i = (int) Math.pow(10, x - 1);
        int counter = 0;
        for (; i < (int) Math.pow(10, x); i++) {
            if (isNumberIncreasing(fillArray(i, x))) {
                counter++;
            }
        }
        return counter;
    }


    public static int []findNumber(int x) {
        int[] arr = new int[findLengthNewArray(x)];
        int i = (int) Math.pow(10, x - 1);
        int test = 0;

        for (int j = 0; j < arr.length; j++) {
            for (; i < (int) Math.pow(10, x); i++) {
                if (isNumberIncreasing(fillArray(i, x))) {
                    arr[j] = i;
                    test = i;
                    break;
                }
            }
            test++;
            i = test;
        }
        return arr;
    }
    public static void showArray(int x) {
        int array[] = findNumber(x);
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + "\t");
        }
    }
}

