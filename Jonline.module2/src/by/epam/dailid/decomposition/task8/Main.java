package by.epam.dailid.decomposition.task8;

public class Main {
    //Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3],D[4]+D[5]+D[6],D[7]+D[8]+D[9]. Написать метод
    // (методы), для вычисления суммы трех последовательно расположенных элементов элементов массива с номерами от
    //k до m.
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int j = 0;
        int l = 3;
        int v = 6;
        int d = 9;
       int result1 = sum(a,j,l);
       int result2 = sum(a,l,v);
       int result3 = sum(a,v,d);
        System.out.print(result1 + " " + result2 + " " + result3);

    }

    public static int sum(int[] x, int k, int m) {
        int sum = 0;
        for (int i = k; i < m; i++) {
            sum += x[i];
        }

        return sum;
    }
}
