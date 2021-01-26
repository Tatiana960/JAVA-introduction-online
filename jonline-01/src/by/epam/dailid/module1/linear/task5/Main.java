package by.epam.dailid.module1.linear.task5;

public class Main {
    /*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
    значение длительности в часах, минутах и секундах.
     */
    public static void main(String[] args) {
        int a = 1234567;
        int h = a/3600;
        int m = (a - h*3600) / 60;
        int s = a - h*3600 - m*60;
        System.out.println((Integer.toString(h) + "ч" + " "+ Integer.toString(m).toUpperCase() +
                "мин" + " " + Integer.toString(s).toUpperCase() + "с"));
    }

}
