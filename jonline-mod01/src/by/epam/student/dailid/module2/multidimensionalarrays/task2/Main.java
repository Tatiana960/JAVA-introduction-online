package by.epam.student.dailid.module2.multidimensionalarrays.task2;

import java.util.Random;

public class Main {
    //Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
    public static void main(String[] args) {
        int x = 6;
        int[][] a = new int[x][x];
        fillArray(a);
        printArray(a);

        System.out.println("Элементы по диагонали: ");
        for(int i = 0; i < a.length; i++){
                System.out.print(a[i][i] + "\t");
            }
        System.out.println();

        System.out.println("Элементы второй диагонали: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i][x-1-i] + "\t");
        }
        }



//заполним массив
        public static  void fillArray(int[][]a) {
            Random rand = new Random();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = rand.nextInt(10);

                }
            }
        }
public static void printArray(int[][]a){
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
            }


    }
