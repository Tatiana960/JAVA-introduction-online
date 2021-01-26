package by.epam.student.dailid.module2.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Даны действительные числа a1,a2.....an.Поменять местами наибольший и наименьший элементы
        int a[] = new int[10];
        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i*i;
        }
        for (int i = 0; i < a.length; i++) {

                if (a[i] > a[max]) {
                    max = i;
                }
                else if (a[i] < a[min]) {
                    min = i;
                }

            System.out.println("Массив до изменений: " + Arrays.toString(a));
        }

            int temp = a[max];
            a[max] = a[min];
            a[min]  = temp;
            System.out.println(Arrays.toString(a));

        }
    }

