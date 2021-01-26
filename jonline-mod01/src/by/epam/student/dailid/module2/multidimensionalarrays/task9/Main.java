package by.epam.student.dailid.module2.multidimensionalarrays.task9;

import java.util.Random;
import java.lang.Math;
public class Main {
    //Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    // Определить, какой столбец содержит максимальную сумму.
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];
        fillArray(a);
        printArray(a);

        System.out.println("Сумма элементов в столбцах :");
        int[] res1 = new int[n];  //массив для хранения сумм столбцов

        for (int i = 0; i < a.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < a.length; j++) {
                sum1 += a[j][i];
            }
            res1[i] = sum1; //записываем сумму элементов столбца в массив
            sum1 = 0; //обнуляем переменную
            System.out.print(res1[i] + "\t");
        }
            System.out.println();

            int max = 0;
            for (int i = 1; i < n; i++) {
                if (res1[i] > res1[max])
                    max = i;
            }
            System.out.println("Номер столбца с максимальной суммой: " + max);
        }



        public static void fillArray ( int[][] a){
            Random rand = new Random();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = rand.nextInt(10);
                }
            }
        }
        public static void printArray ( int[][] a){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        }

}
