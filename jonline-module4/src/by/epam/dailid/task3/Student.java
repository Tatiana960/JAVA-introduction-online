package by.epam.dailid.task3;
import java.util.*;
import java.lang.*;

public class Student {
    //Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из
    // пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров
    // групп студентов, имеющих оценки, равные только 9 и 10.
    private String name;
    private String numOfGroup;
    private int[] rating;

    public Student(String name, String numOfGroup, int[] rating) {
        this.name = name;
        this.numOfGroup = numOfGroup;
        this.rating = new int[5];
        this.rating = rating;
    }



    @Override

    public String toString() {
        return String.format("surname: %s, group: %s", name, numOfGroup);
    }

    public  boolean isStudentSuccessful() {

        for (int i = 0; i < rating.length; i++) {

            if (rating[i] < 9) {
                return false;
            }
        }
        return true;

    }
}



