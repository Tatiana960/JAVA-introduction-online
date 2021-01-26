package by.epam.dailid.task4;



public class Main {
    //В строке найти количество чисел
    public static void main(String[] args) {
        String str = "Сегодня 13 апреля 2020 года, завтра 14 апреля 2020 года";
        String[] partsStr = str.split(" ");

        System.out.println("В данной строке  " + (calculateNumbers( partsStr) + " числа"));
    }

    public static int calculateNumbers(String[] partsStr) {
        int counter = 0;
        for (int i = 0; i < partsStr.length; i++) {

            if (splitPartsOfString(partsStr[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean splitPartsOfString(String x) {

            char[] ch = x.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (Character.isDigit(ch[j])) {
                    return true;
                }
            }
        return false;
    }
}

