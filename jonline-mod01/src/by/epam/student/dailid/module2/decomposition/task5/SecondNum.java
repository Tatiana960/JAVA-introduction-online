package by.epam.student.dailid.module2.decomposition.task5;

import java.util.Random;

public class SecondNum {
    //Составить программу, которая в массиве A(N) находит второе по величине число(вывести на печать число, которое
    //меньше максимального элемента массива, но больше всех других элементов
    public static void main(String[] args) {
        int n = 10;
        int a[] = new int[n];
        fillArray(a);
        prinArray(a);
        System.out.println("Второе по величине число: ");
        System.out.println(secondNum(a));
    }

    public static void fillArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(20);
        }
    }

    public static void prinArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    public static int secondNum(int[] a) {
        int temp = 0;
        int sn = 0;
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = false;
                }
                if (a[a.length-2]!=a[a.length-1]) {
                    sn = a[a.length - 2];
                }else sn = a[a.length-3];

            }
        }return sn;
    }
}





