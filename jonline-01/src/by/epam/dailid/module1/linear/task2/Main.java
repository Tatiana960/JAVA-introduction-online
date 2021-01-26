package by.epam.dailid.module1.linear.task2;

public class Main {
    //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    // (b + sqrt(b2 + 4ac))/2a - a3c + b-2
    public static void main(String[] args) {
        double b = 3.1;
        double a = 4.6;
        double c = 10.1;
        double result;
        double x = b*b + 4*a*c;
        double y = Math.sqrt(x);
        double z = (b + y)/ 2*a;
        a = Math.pow(a,3);
        b = Math.pow(b,-2);
        result = z - a*c + b;
        System.out.println(result);
    }

}
