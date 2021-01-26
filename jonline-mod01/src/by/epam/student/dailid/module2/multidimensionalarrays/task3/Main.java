package by.epam.student.dailid.module2.multidimensionalarrays.task3;
import java.util.Random;
public class Main {
    //Дана матрица. Вывести k-ю строку и p-ый столбец
    public static void main(String[] args) {
        int x = 6;
        int k = 3;
        int p = 5;
        int [][] a = new int[x][x];
        fillArray(a);
        printArray(a);

        System.out.println("K- строка матрицы: ");
            for(int j = 0; j < a.length; j++){
                System.out.print(a[k-1][j] + "\t");
            }
        System.out.println();

        System.out.println("P-ый столбец матрицы: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i][p-1] + "\t");
        }
        System.out.println();
        }

    public static void fillArray(int [][]a){
        Random rand = new Random();
        for(int i = 0; i < a.length; i++){
            for( int j = 0; j < a.length; j++){
                a[i][j] = rand.nextInt(10);
            }
        }
    }
    public static void printArray(int[][]a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
