package by.epam.student.dailid.module1;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        //для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа,
        //m и n вводятся с клавиатуры

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два целых натуральных числа, где второе больше первого.");
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i = m; i <= n; i++){
            for(int j = 2; j < n; j++)
            if (i%j==0 && i!=j){
                System.out.println("Делитель для  " + i + " = " +j);
            }
        }
    }
}
