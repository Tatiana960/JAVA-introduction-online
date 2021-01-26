package by.epam.student.dailid.module1;
import java.lang.Math;
public class ex17 {
    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main(String[] args) {
        int x = 123648;
        int y = 123456144;

        int moduleX = Math.abs(x);
        int moduleY = Math.abs(y);

        while (moduleX > 0) {

            int resultX = moduleX % 10;
            moduleX /= 10;
            while (moduleY > 0) {

                if ((moduleY % 10) == resultX) {

                    System.out.println("Цифры, входящие в запись обоих чисел: " + resultX);
                }

                moduleY /= 10;
            }
            moduleY = Math.abs(y);
        }
    }
}









