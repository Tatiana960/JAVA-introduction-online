package by.epam.student.dailid.module2.decomposition.task1;
import miscellanneous.Books;
import java.lang.InterruptedException;
import java.util.Scanner;
public class Decomposion_task1 {
    //Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
    // двух натуральных чисел.
    public static void main(String[] args) throws InterruptedException {

            int a = enter("Введите натуральное положительное число: ");
            int b = enter(" Введите натуральное положительное число: ");
            boolean flag = checkNums(a,b);
            int result = GreatestCommonDivisor(a, b);
            int result2 = LeastCommonMultiply(a, b);

            System.out.println("Для чисел " + a + " и " + b + " НОК составит: " + result +
                    " , НОД составит: " + result2);

        }

    public static int enter(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введенные данные не являются натуральным числом. Повторите ввод:");
        }
        return scanner.nextInt();
    }
    private static boolean checkNums(int a, int b){
        if(a>0 && b >0 ){
            return true;
        }else {
            return false;
        }
    }
    public static int GreatestCommonDivisor(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return GreatestCommonDivisor(b, a % b);
        }
    }
    public static int LeastCommonMultiply(int a, int b){
        return (a * b) / GreatestCommonDivisor(a, b);
    }
}
