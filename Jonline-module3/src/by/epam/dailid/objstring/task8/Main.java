package by.epam.dailid.objstring.task8;

import java.util.Scanner;

public class Main {
    //Вводится строка слов, разделенная пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда
    //самых длинных слов может быть несколько, не обрабатывать
    public static void main(String[] args) {
        String str = getLine();
        getTheLongestWord2(str);
    }

    public static String getLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        while (!sc.hasNextLine()) {
            System.out.println("Неверно, попробуйте еще раз");
            sc.next();
        }
        String str = sc.nextLine();
        return str;
    }

    public static boolean isSameLengthWords(String str) {
        String[] string = str.split(" ");
        String longestWord = getTheLongestWord(str);
        int counter = 0;
        for (String strings : string) {
            if (strings.length() == longestWord.length()) {
                counter++;
            }
            if (counter >= 2) {
                return true;
            }
        }
        return false;
    }

    public static String getTheLongestWord(String str) {
        String[] string = str.split(" ");
        String longestWord = "";

        for (String strings : string) {
            if (strings.length() > longestWord.length()) {
                longestWord = strings;
            }
        }
        return longestWord;
    }

    public static void getTheLongestWord2(String str) {

        String[] string = str.split(" ");
        String longestWord = "";
        if (isSameLengthWords(str) == false) {
            for (String strings : string) {
                if (strings.length() > longestWord.length()) {
                    longestWord = strings;
                }
            }
            System.out.println("Самое длинное слово в строке: " + longestWord);
        } else {
            System.out.println("Данная строка не может быть обработана, так как в ней присутствует несколько " +
                    "слов одинаковой длины. ");
        }
    }
}

