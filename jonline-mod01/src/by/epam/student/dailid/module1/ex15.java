package by.epam.student.dailid.module1;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        //Напишите программу, где пользователь вводит любое положительное целое число, а программа суммирует
        // все числа от 1 до введенного пользователем числа
        System.out.println("Введите любое целое положительное число и нажмите клавишу Enter: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        if ((x <= 0) && (x%1 !=0)) {
            System.out.println("Вы ввели неверное число, попробуйте еще раз");

        }else
            for (int i = 1; i <= x; i++){
               result += i;

            }
        System.out.println("Сумма чисел от 1 до введенного вами числа составила: " + result);
    }
    }