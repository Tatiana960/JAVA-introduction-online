package by.epam.dailid.decomposition.task3;

public class Main {
    //Даны две последовательности a1 <=a2 ... <= an, b1 <= b2 <= bm. Образовать из них новую последовательность чисел так
    // чтобы она тоже была неубывающей. Дополнительный массив не использовать
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int b[] = new int[]{3, 5, 7, 9, 11, 13, 17};
        int c[] = new int[a.length + b.length];
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] <= a[i]) {
                   c[i] = b[j];

                } else c[i] = a[i];

            }

        }

        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l] + "\t");
        }
    }
}