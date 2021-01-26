package by.epam.student.dailid.module2.multidimensionalarrays.task6;

public class Main {
    //Сформировать квадратную матрицу порядка n по заданному образцу(n-четное)
    // 1 1 1 . . . 1 1 1
    //0 1 1 . . . 1 1 0
    //0 0 1 . . .1 0 0
    //.................
    //1 1 1.......1 1 1
    public static void main(String[] args) {
        int n = 10;
        int a[][] = new int[n][n];

        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = i; j < n - i; j++) {
                a[i][j] = 1;
            }
        }
        for (int i = n / 2; i < n; i++){
            for(int j = n - i -1; j < i +1; j++){
                a[i][j] = 1;
    }
}

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
