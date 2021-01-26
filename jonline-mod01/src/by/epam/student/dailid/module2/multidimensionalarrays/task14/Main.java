package by.epam.student.dailid.module2.multidimensionalarrays.task14;

public class Main {
    //Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно
    //номеру столбца.
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int a[][] = new int[n][m];
        fillArray(a);
        printArray(a);
    }

    public static void fillArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
              if (j-i >=1 ) {
                   a[i][j] = 1;
               }

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
