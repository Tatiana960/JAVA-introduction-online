package by.epam.student.dailid.module2.task1;

public class Main {
    public static void main(String[] args) {
        //В Массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

        int A[] = new int[30];
        int K = 5;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = i;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % K == 0 && A[i] != 0) {
                sum += A[i];
            }
        }
                System.out.println("Сумма элементов массива, кратных K  - " + K + ", равно: " + sum);
            }
        }





