package by.epam.dailid.objstring.task3;

import java.util.Scanner;

public class Main {
    //Проверить, является ли заданное слово палиндромом
    public static void main(String[] args) {
        String str = getWord();
        System.out.println("Введенное слово: " + str);
        isWordPalindrome(str);

    }

    public static String getWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        while (!sc.hasNextLine()) {
            System.out.println("Неверно, попробуйте еще раз");
            sc.next();
        }
        String str = sc.nextLine();
        return str;
    }

    public static void isWordPalindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        StringBuilder strRev = s.reverse();
        if (s.toString().equals(str.toString())) {
            System.out.println("Заданное слово является палиндромом");
        } else {
            System.out.println("Заданное слово не является палиндромом");
        }
    }

}





