package by.epam.dailid.objstring.task7;

import java.util.Scanner;

public class Main {
    // Вводится строка. Требуется удалить из нее все повторяющиеся символы и пробелы. Например, если было введено
    //"abc cde def", то должно быть выведено "abcdef"
    public static void main(String[] args) {
        String str = getLine();
       String string = deleteWhiteSpaces(str);
        System.out.println(editLine(string));
    }

    public static String getLine(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        while (!sc.hasNextLine()){
            System.out.println("Неверно, попробуйте еще раз");
            sc.next();
        }
        String str = sc.nextLine();
        return str;
    }

    public static String deleteWhiteSpaces(String str){
        StringBuilder s = new StringBuilder();
        str = str.trim();
        for(int i = 0; i < str.length(); i++){

         if(!Character.isWhitespace(str.charAt(i))){
             s.append(str.charAt(i));
         }

        }
        String string = s.toString();
        return string;
    }
    public static String editLine(String str){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                s.append(str.charAt(i));
            } else {
                continue;
            }
        }
        str = s.toString();
        return str;
    }
}
