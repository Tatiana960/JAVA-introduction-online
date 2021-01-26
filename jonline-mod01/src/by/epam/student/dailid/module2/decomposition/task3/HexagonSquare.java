package by.epam.student.dailid.module2.decomposition.task3;
import java.lang.Math;
public class HexagonSquare {
    //вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника
    public static void main(String[] args) {
        int a = 6;
        double square = Square(a);
        System.out.println(square);
    }

    public static double Square (int a) {
        double res = (double) (3*Math.sqrt(3)*a*a)/2;
        return res;

    }
}
