package by.epam.student.dailid.module2.multidimensionalarrays.task13;
import java.util.Random;
public class Main {
    //отсортировать столбцы матрицы по возрастанию и убыванию элементов
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];
        fillArray(a);
        printArray(a);
        System.out.println("____________________________");

        boolean ifSorted = false;
        int buffer;
        //сортировка по возрастанию
//        while (!ifSorted) {
//            ifSorted = true;
//            for (int i = 0; i < a.length - 1; i++) {
//                for (int j = 0; j < a.length; j++) {
//
//                    if (a[i][j] > a[i + 1][j]) {
//                        ifSorted = false;
//                        buffer = a[i][j];
//                        a[i][j] = a[i + 1][j];
//                        a[i + 1][j] = buffer;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j] + "\t");
//            }
//            System.out.println();
//        }
        System.out.println("____________________________");
        //сотрировка по убыванию
        while (!ifSorted) {
            ifSorted = true;

            for (int i = 0; i < a.length-1; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][j] < a[i+1][j]) {
                        ifSorted = false;
                        buffer = a[i][j];
                        a[i][j] = a[i+1][j];
                        a[i+1][j] = buffer;
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








