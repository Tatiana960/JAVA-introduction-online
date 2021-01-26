package by.epam.dailid.task3;

public class Main {
    //В строке найти количество цифр.
    public static void main(String[] args) {
        String str = "200 негритят отправились обедать, один поперхнулся и осталось 199 негритят";

        char[] arr = str.toCharArray();
        System.out.println("В строке: " + str + " количество цифр составляет: ");
        System.out.println(calculateDigits(arr));
    }
        public static int calculateDigits (char [] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {

                if (Character.isDigit(arr[i])) {
                    count++;
                }
            } return count;
        }
    }

