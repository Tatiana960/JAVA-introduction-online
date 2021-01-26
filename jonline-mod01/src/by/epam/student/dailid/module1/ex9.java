package by.epam.student.dailid.module1;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
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
