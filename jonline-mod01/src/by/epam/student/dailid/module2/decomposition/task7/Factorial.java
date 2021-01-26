package by.epam.student.dailid.module2.decomposition.task7;

public class Factorial {
    //написать метод(методы), для вычисления суммы факториалов всех нечетных чисел от 1 до 9
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Сумма факториалов нечетных чисел от 1 до 9 :" + sumFactorials(n));
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int sumFactorials(int n){
        int sum = 0;
        for(int i = 1; i <= n; i+=2){
            sum += factorial(i);
        }
        return sum;
    }
}
