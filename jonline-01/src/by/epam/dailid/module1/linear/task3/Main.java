package by.epam.dailid.module1.linear.task3;

public class Main {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
   // ((sin x + cos y) / ( cos x - sin y ))* tg x*y
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
