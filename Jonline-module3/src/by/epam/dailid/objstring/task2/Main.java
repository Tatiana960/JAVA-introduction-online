package by.epam.dailid.objstring.task2;

import java.util.Scanner;

public class Main {
    //В строке вставить после каждого символа "a" символ "b".
    public static void main(String[] args) {
        String str = getString();
        System.out.println(str);

        System.out.println(putSymbol(str));

    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        while (!sc.hasNextLine()){
            System.out.println("Неверно, попробуйте еще раз");
            sc.hasNext();
        }
        String str = sc.nextLine();
        return str;
    }

    public static String putSymbol(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length();i++) {

            sb.append(str.charAt(i));

            if (str.charAt(i) == 'a') {
                sb.append('b');
            }
        }


        String string =  sb.toString();
        return string;
    }

}
