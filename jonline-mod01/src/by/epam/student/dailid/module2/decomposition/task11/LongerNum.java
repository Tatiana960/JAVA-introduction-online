package by.epam.student.dailid.module2.decomposition.task11;

public class LongerNum {
    //Написать метод(методы), определяющие, в каком из данных двух чисел больше цифр
    public static void main(String[] args) {
        int a = 1234567;
        int b = 123456789;
        compFigures(a,b);
    }

    public static void compFigures(int a, int b) {
        int moduleA = Math.abs(a);
        int moduleB = Math.abs(b);
        int temp = 0;
        do {
            moduleA /= 10;
            temp++;
        }
        while (moduleA > 0);
        int temp2 = 0;
        do {
            moduleB /= 10;
            temp2++;
        }
        while (moduleB > 0);
        if (temp > temp2) {
            System.out.println("В первом числе больше цифр.");
        } else
            System.out.println("Во втором числе больше цифр");

    }
}