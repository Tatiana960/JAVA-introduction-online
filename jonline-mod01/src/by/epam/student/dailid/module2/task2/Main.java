package by.epam.student.dailid.module2.task2;

public class Main {
    public static void main(String[] args) {
        //Дана последовательность действительных чисел: a1, a2....an. Заменить все ее члены, большие данного Z,
        //этим числом. Подсчитать количество замен.
        int a[] = new int[20];
        int Z = 15;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i]);
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > Z) {
                a[i] = Z;
                count++;
            }

            System.out.print(a[i]);

        }
        System.out.println();
        System.out.println("Количество произведенных замен: " + count);
    }
}

