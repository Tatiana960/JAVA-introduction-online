package by.epam.dailid.module1.linear.task6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Для данной области составить линейную программу, которая печатает true, если точка с координатами (x , y)
        //принадлежит закрашенной области, и false -  в противном случае.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты x и y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        boolean b;
        if (x > 2 || x < -2) {
            b = false;
            System.out.println(b);
        }
        else if (y > 4 || y < -3){
            b = false;
            System.out.println(b);}
        else {
            b = true;
            System.out.println(b);
        }
    }

}
