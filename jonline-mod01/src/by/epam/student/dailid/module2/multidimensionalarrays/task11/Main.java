package by.epam.student.dailid.module2.multidimensionalarrays.task11;

public class Main {
    //Матрицу 10 на 20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    //которых число 5 встречается 3 и более раз
    static int n = 10;
    static int m = 20;

    public static void main(String[] args) {

        int[][] a = new int[n][m];
        fillArray(a);
        printArray(a);
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            int curcount = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 5) {
                    count++;

                }
            }

            if (count >= 3) {
                b[i] = i;
            }
            else return;
            System.out.print("Номера строк, в которых число 5 встречается 3 и более раз: " + b[i+1] + "\t");
        }
    }

        public static void fillArray ( int[][] a){

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = (int) (Math.random() * 16);
                }
            }
        }

        public static void printArray ( int[][] a){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
