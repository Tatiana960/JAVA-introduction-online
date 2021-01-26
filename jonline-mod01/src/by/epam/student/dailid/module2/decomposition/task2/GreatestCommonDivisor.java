package by.epam.student.dailid.module2.decomposition.task2;
import java.awt.*;
import java.util.Scanner;
public class GreatestCommonDivisor {
    //Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
    public static void main(String[] args) {
        int a = enter("Введите натуральное положительное число: ");
        int b = enter("Введите натуральное положительное число: ");
        int c = enter("Введите натуральное положительное число: ");
        int d = enter("Введите натуральное положительное число: ");
        int result = greatestCommonDivisor(a,b,c,d);
        System.out.println("НОД для чисел: " + a + " , " + b + " , " + c + " , " + d + " = " + result);
    }
    public static int enter(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введенное число не является натуральным, повторите ввод: ");
        }
        return sc.nextInt();
        }
        public static int greatestCommonDivisor(int a, int b, int c, int d){
        if(b==0){
            return a;
        }else {
            return greatestCommonDivisor(b, a%b, a%c, a%d);
        }
        }
    }

