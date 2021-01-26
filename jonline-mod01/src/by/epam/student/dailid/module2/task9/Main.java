package by.epam.student.dailid.module2.task9;

import java.util.Random;
import java.util.Arrays;


public class Main {
    //В массиве целочисленных значений с количеством элементов n найти наиболее часто встречающееся число.
    //Если таких чисел несколько, определить наименьшее из них
    public static void main(String[] args) {
        int n = 10;
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * n);

        }
        System.out.println("Исходный массив: " + Arrays.toString(a));

        int count = 0;
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            int curcount = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    curcount++;

                }
            }
            if (curcount > count) {
                count = curcount;
                result = a[i];
            } else if (curcount == count) {
                result = Math.min(result, a[i]);
            }
        }
                System.out.println("Минимальный из наиболее часто встречающихся элементов массива: " + result +
                        "  количество повторов данного элемента: " + count);
            }
        }









