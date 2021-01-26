package by.epam.dailid.objstring.task9;

import java.util.Scanner;

public class Main {
    //Посчитать количество строчных  (маленьких) и прописных (больших) букв в введенной строке. Учитывать только
    //английские буквы.
    public static void main(String[] args) {
        String string = getString();
        System.out.println("Во введенной строке " + checkLittleChars(string) + " строчных английских букв и " +
                +checkBigChars(string) + " прописных английских букв");
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        if (!sc.hasNextLine()) {
            System.out.println("Неверно, попробуйте еще раз");
            sc.next();
        }
        String string = sc.nextLine();
        return string;
    }

    public static int checkLittleChars(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

                if ( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') {
                    if (Character.isAlphabetic(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                        counter++;
                    }
                }
            }
        return counter;
    }

    public static int checkBigChars(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

                if ( str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z') {
                    if (Character.isAlphabetic(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                        counter++;
                    }
                }
            }
        return counter;
    }
}
