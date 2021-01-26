package by.epam.student.dailid.module2.multidimensionalarrays.task15;

import java.util.Random;

public class Main {
    //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
    public static void main(String[] args) {
        int n = 5;
        int a[][] = new int[n][n];
        fillArray(a);
        printArray(a);

        int buffer;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i][j] > max) {
                    max = a[i][j];

                }

            }

        }
        System.out.println("Максимальный элемент массива: " + max);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }
        System.out.println("Видоизмененная матрица: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public static void fillArray(int a[][]){
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
               a[i][j] =  rand.nextInt(15);
            }
        }
    }
    public static void printArray(int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
