package by.epam.student.dailid.module2.multidimensionalarrays.task8;

import java.util.Random;
import java.util.Scanner;
public class Main {
    //В числовой матрице поменять местами два столбца( элементы одного поместить в соответствующие позиции другого, а
    // элементы второго переместить на позиции первого. Пользователь вводить номер столбца с клавиатуры.
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[n][n];
        fillArray(a);
        printArray(a);
        System.out.println("Введите номера столбцов, которые хотите поменять местами через клавишу пробел," +
                " в конце нажмите клавишу <Enter>: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Измененный массив: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int temp = a[i][x-1];
               a[i][x-1] = a[i][y-1];
               a[i][y-1] = temp;
                }
            }
                 for(int i = 0; i < n; i++){
                     for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

            public static void fillArray ( int[][] a){
                Random rand = new Random();
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        a[i][j] = (int) rand.nextInt(10);
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


