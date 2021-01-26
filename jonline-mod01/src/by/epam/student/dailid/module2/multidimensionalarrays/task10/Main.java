package by.epam.student.dailid.module2.multidimensionalarrays.task10;

import java.util.Random;

public class Main {
    //Найти положительные элементы главной диагонали квадратной матрицы
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];
        fillArray(a);
        printArray(a);
        System.out.println("Элементы главной диагонали матрицы: ");
        int res[] = new int[n]; //массив для хранения значений главной диагонали
        for (int i = 0; i < a.length; i++) {

            int x = 0;
            x = a[i][i];
            res[i] = x;
            x = 0;
            System.out.print(a[i][i] + "\t");
        }
        System.out.println();

        int comp = 0;
        System.out.println("Положительные элементы главной диагонали матрицы: ");
        for (int i = 0; i < a.length; i++) {
            int res1[] = new int[n];
            if (res[i] > 0)
                comp = res[i];
            res1[i] = comp;
            comp = 0;
            if (res1[i] > 0) {
                System.out.print(res1[i] + "\t");
            }
            System.out.println();
        }
    }

        public static void fillArray ( int[][] a){

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = ((int) (Math.random() * 10) - 5);
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




