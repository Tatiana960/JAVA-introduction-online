package by.epam.dailid.objstring.task5;

import java.util.Scanner;

public class Main {
    //Подсчитать, сколько раз среди символов заданной строки встречается буква "a".
    public static void main(String[] args) {
        String str = getString();
        System.out.println("Количество символов 'a' в введенной строке: " + calculateChars(createCharArray(str)));
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        if(!sc.hasNextLine()){
            System.out.println("Неверно, попробуйте еще раз");
            sc.next();
        }
        String str = sc.nextLine();
        return str;
    }

    public static char[] createCharArray(String str){
        char[] array = str.toCharArray();
        return array;
    }
    public static int calculateChars(char[] array){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 'a'){
                counter++;
            }
        }
        return counter;
    }
}
