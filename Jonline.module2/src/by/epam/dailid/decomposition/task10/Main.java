package by.epam.dailid.decomposition.task10;

public class Main {
    //Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого являются
    // цифры числа N.
    public static void main(String[] args) {
        int n = 23456789;
        int a = getModule(n);
        int m = lengthArray(a);
        int array1[] = formArray(a, m);
        sortArray(array1);
        printArray(array1);

    }

    public static int getModule(int a) {
        a = Math.abs(a);
        return a;
    }

    public static int lengthArray(int a) {
        int count = 0;
        int test = 0;
        while (a > 0) {
            test = a % 10;
            a /= 10;
            count++;
        }

        return count;
    }

    public static int[] formArray(int a, int c) {
        int array[] = new int[c];
        for (int i = 0; i < c; i++) {
            array[i] = a % 10;
            a /= 10;
        }
        return array;
    }

    public static void sortArray(int x[]) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;


            for (int i = 0; i < x.length - 1; i++) {
                int buf;
                if (x[i] > x[i + 1]) {
                    isSorted = false;

                    buf = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = buf;
                }
            }
        }
    }
    public static void printArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println();
    }

}







