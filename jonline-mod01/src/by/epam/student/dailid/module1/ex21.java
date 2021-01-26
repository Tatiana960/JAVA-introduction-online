package by.epam.student.dailid.module1;

public class ex21 {
    //вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            System.out.println("Cимвол " + (char) i + ", код " + i);

        }
    }
}
