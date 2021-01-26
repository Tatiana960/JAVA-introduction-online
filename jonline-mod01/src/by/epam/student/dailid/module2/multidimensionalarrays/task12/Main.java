package by.epam.student.dailid.module2.multidimensionalarrays.task12;

import java.util.Random;

public class Main {
    //Отсортировать строки матрицы по возрастанию и убыванию значений элементов
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];
        fillArray(a);
        printArray(a);
        System.out.println("____________________________");

        boolean ifSorted = false;
        int buffer;
        //сортировка по возрастанию
        while (!ifSorted) {
            ifSorted = true;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {

                    if (a[i][j] > a[i][j + 1]) {
                        ifSorted = false;
                        buffer = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = buffer;
                    }
                }
            }

        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("____________________________");
                  //сотрировка по убыванию
        while (!ifSorted) {
            ifSorted = true;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[i][j] < a[i][j + 1]) {
                        ifSorted = false;
                        buffer = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = buffer;
                    }
                }
            }
        }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
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




