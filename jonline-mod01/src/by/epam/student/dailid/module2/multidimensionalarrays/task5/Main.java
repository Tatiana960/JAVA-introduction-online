package by.epam.student.dailid.module2.multidimensionalarrays.task5;

public class Main {
    //Сформировать квадратную матрицу по заданному образцу:
     //1 1 1 ...  1 1 0
     //2 2 2 ...  2 0 0
     //3 3 3 ...  0 0 0
     //n-1 n-1 ...
    public static void main(String[] args) {

            int n = 10;
            int[][] a = new int[n][n];
            fillArray(a);
            printArray(a);
        }

        public static void fillArray(int[][] a) {
            int n = 10;

            for (int i = 0; i < n ; i++) {
                for (int j = 0; j <= n-(i + 1); j++) {
                        a[i][j] = i+1;


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






