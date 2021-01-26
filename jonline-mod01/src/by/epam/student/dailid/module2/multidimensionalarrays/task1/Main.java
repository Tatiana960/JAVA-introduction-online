package by.epam.student.dailid.module2.multidimensionalarrays.task1;
import java.util.Arrays;
public class Main {
    //Дана матрица. Вывести на экран все нечетные стоблцы, у которых первых элемент больше последнего
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {445, 333, 555, 8, 999, 67},
                {45, 67, 98, 23, 56, 17},
                {234, 6, 1, 2, 3, 445},
                {333, 444, 555, 666, 777, 888},
                {34, 56, 78, 90, 3, 2},
                {345, 567, 890, 654, 786, 1}};

        printArray(a);


        int length = a.length;
        int length1 = a[0].length;


        for (int i = 1; i < a.length; i += 2) {
            if (a[0][i] > a[length1 - 1][i]){
                System.out.println("Столбец №: " + i);
                for (int j = 0; j < length1; j++) {
                    System.out.println(a[j][i]);

                }
            }
        }

    }
    public static void printArray(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}







