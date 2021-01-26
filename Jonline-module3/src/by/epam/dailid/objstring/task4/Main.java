package by.epam.dailid.objstring.task4;

public class Main {
    //С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".

    public static void main(String[] args) {
        String str = "Информатика";
        System.out.println(str);

        String cake = "";
        cake = cake.concat(str.substring(7,8));
        cake = cake.concat(str.substring(3, 5));
        cake = cake.concat(str.substring(7,8));


        System.out.println(cake);
    }
}

