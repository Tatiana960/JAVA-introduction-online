package by.epam.student.dailid.module1;

public class ex22 {
    //вычислить значение функции на отрезке [a,b] с шагом h
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        int h = 2;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.println("y = " + y + " при x = " + i);
        }
    }
}
