package by.epam.dailid.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student students[] = new Student[10];

        students[0] = new Student("Иванов И.И", "B-212", new int[]{5, 6, 9, 9, 6});
        students[1] = new Student("Петров П.П.", "B-212", new int[]{5, 5, 5, 5, 9});
        students[2] = new Student("Сидоров С.С.", "B-212", new int[]{9, 9, 10, 10, 9});
        students[3] = new Student("Печкин П.П.", "B-212", new int[]{9, 8, 10, 7, 9});
        students[4] = new Student("Пирожков А.А.", "B-212", new int[]{1, 2, 4, 5, 6});
        students[5] = new Student("Федоров С.С.", "B-212", new int[]{9, 9, 10, 9, 9});
        students[6] = new Student("Селезнев С.С.", "B-212", new int[]{3, 9, 10, 9, 9});
        students[7] = new Student("Пупкин В.В.", "B-212", new int[]{9, 9, 10, 9, 9});
        students[8] = new Student("Котов В.Д", "B-212", new int[]{3, 4, 4, 5, 6});
        students[9] = new Student("Дайлид Т.В.", "B-212", new int[]{10, 10, 10, 10, 10});

        chooseSuccessfulStudents(students);

    }

    public static void chooseSuccessfulStudents(Student students[]) {
        for (Student st: students) {

            if (st.isStudentSuccessful()) {
                System.out.print(st + " ");
            }
        }
    }
}
