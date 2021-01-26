package by.epam.student.dailid.module2.decomposition.task6;

import java.util.Scanner;

import static by.epam.student.dailid.module2.decomposition.task2.GreatestCommonDivisor.greatestCommonDivisor;

public class SimpleNums {
    //Написать метод(методы), определяющие, являются ли данные три числа взаимно простыми.
    public static void main(String[] args) {
        int a = enter("Введите натуральное положительное число: ");
        int b = enter(" Введите натуральное положительное число: ");
        int c = enter("Введите натуральное положительное число: ");
        int result = greatestCommonDivisor(a,b,c);
        simpleNums(result);

    }
    public static int enter(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()){
            sc.next();
            System.out.println("Введенные данные не являются натуральным числом. Повторите ввод:");
        }
        return sc.nextInt();
    }
    public static int greatestCommonDivisor(int a, int b, int c){
        if(b==0){
            return a;
        }else {
            return greatestCommonDivisor(b, a%b, a%c);
        }
    }
    public static void simpleNums(int result){
        if(result==1){
            System.out.println("Данные числа являются взаимно простыми.");
        }else System.out.println("Данные числа не являются взаимно простыми.");
    }

}
