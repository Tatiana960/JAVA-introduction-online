package by.epam.dailid.sorting.task3;

public class Main {
    //Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<=an. Требуется переставить элементы так, чтобы
    //они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент и
    //ставится на первое место, а первый- на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
    // Написать алгоритм сортировки выбором.
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < a.length; i++) {
            int max = a[i];
            int max_i = i;
            for (int j = i + 1; j < a.length; j++) {

                if (a[j] > max) {
                    max = a[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int temp = a[i];
                a[i] = a[max_i];
                a[max_i] = temp;
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
}
