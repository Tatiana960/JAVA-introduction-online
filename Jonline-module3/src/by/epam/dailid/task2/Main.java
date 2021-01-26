package by.epam.dailid.task2;

public class Main {
    //Замените в строке все вхождения "word" на 'letter"
    public static void main(String[] args) {
        String str = "The first word for many children is the word 'Mum'. ";
        System.out.println(str);
        String newString;

        newString = str.replace("word", "letter");

        System.out.println(newString);

    }
}
