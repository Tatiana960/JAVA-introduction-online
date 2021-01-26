package by.epam.student.dailid.module2.multidimensionalarrays.task4;

public class Main {
    //сформировать квадратную матрицу порядка n по заданному образцу, n - четное
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        fillArray(a);
        printArray(a);
    }

    public static void fillArray(int[][] a) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    a[i][j] = j + 1;
                } else {
                    a[i][j] = n - j;
                }
            }
        }
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}



