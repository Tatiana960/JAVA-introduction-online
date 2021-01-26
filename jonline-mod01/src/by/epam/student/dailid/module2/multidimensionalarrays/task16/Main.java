package by.epam.student.dailid.module2.multidimensionalarrays.task16;

public class Main {
    //Магическим квадратом порядка n является квадратная матрица размером nXn, составленная из чисел 1,2,3...n, таким
    //образом, что суммы по каждому столбцу каждой строке, каждой из двух больших диагоналей равны между собой.
    //Построить такой квадрат.
    public static void main(String[] args) {
        int n = 3;
        int a[][] = new int[n][n];
        fillArray(a);
        reverseArray(a);
        printArray(a);
    }
        public static void fillArray(int a[][]){
        int k = 1;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++) {
                a[i][j] = k;
                k++;
            }
            }
        }
        public static void reverseArray(int a[][]){
           int num = 1;
           int nn = a.length*3/2;
                for(int i = 0; i <a.length; i++){
                    for (int j = 0; j < a.length; j++){
                        a[(j - i + nn) % a.length][(i * 2 - j + a.length) % a.length] = num++;
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

