package by.epam.student.dailid.module1;
import java.lang.Math;
public class ex3 {
    public static void main(String[] args) {
        double x = 5.5;
        double y = 8.65;
        double result;
        double sinx = Math.sin(x);//вычисляем синус х;
        double cosx = Math.cos(x);//вычисляем косинус х;
        double siny = Math.sin(y);
        double cosy = Math.cos(y);
        double xy = x*y;
        double txy = Math.tan(xy);
        result = ((sinx + cosy)/(cosx - siny))*txy;
        System.out.println(result);
    }
}
