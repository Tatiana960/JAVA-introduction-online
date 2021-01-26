package by.epam.dailid.decomposition.task13;

import java.util.Scanner;

public class Main {
    //Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43).
    // Найти и напечатать все пары близнецов из отрезка (N, 2 N), где N - заданное натуральное число больше 2.
    public static void main(String[] args) {
        int a = getNumber();
        if (checkNum(a)) {
            int[] b = fillArray(a);
            int[][] b1 = fillArrBuff(b);
            outputDoubleArr(b1);
        }
    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число больше 2: ");
        int x;
        String str;
        while (!sc.hasNextInt()) {
            str = sc.nextLine();
            System.out.println("Некорректный ввод, попробуйте еще раз.");
        }
        x = sc.nextInt();
        return x;
    }
    public static boolean checkNum(int num) {
        if (num <= 2 ) {
            return false;
        }
        return true;
    }
    public static int []  fillArray(int x){
        int arr[] = new int[x];
        for(int i = 0; i < arr.length; i++){
            arr[i] = x;
            x++;
        }
        return arr;
    }
    public static boolean isNumberSimple(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
                if (counter > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findQuantityOfPairNum(int[] arr) {
        int counterOfPairNums = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (isNumberSimple(arr[i]) && isNumberSimple(arr[i + 2])) {
                counterOfPairNums++;
            }

        }
        return counterOfPairNums;
    }
    public static int[][] fillArrBuff(int[] arr) {
        int countPairNum = findQuantityOfPairNum(arr);
        int j = 0;
        int arrBuff[][] = new int[countPairNum][2];

        for (int i = 0; i < arr.length - 2; i++) {
            if (isNumberSimple(arr[i]) && isNumberSimple(arr[i + 2])) {
                arrBuff [j][0]=arr[i];
                arrBuff [j][1] =arr[i+2];
                j++;
            }

        }
        return arrBuff;
    }
    public static void outputDoubleArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
    }
}


