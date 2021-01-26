package by.epam.dailid.module1.linear.task4;

public class Main {
    //Дано действительное число R в формате nnn.ddd. Поменять местами дробную и целую части числа и вывести
    //полученное значение числа
    public static void main(String[] args) {
        double R = 333.666;
        double y = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println(y);

    }

}
