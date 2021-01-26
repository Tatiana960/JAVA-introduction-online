package by.epam.dailid.objstring.task6;

import java.util.Scanner;

public class Main {
    //Из заданной строки создать новую, повторив каждый символ дважды
    public static void main(String[] args) {
        String str = getString();
        System.out.println(createNewLine(str));
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        while (!sc.hasNextLine()) {
            System.out.println("Неверно, попробуйте еще раз");
            sc.hasNext();
        }
        String str = sc.nextLine();
        return str;
    }

    public static String createNewLine(String str) {
        StringBuilder sb = new StringBuilder();
        String newone = str;

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            for(int j = 0; j < str.length(); j++){
                sb.append(newone.charAt(i));
                break;
            }

            }

        String string = sb.toString();
        return string;
    }
}
