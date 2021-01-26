package by.epam.dailid.objstring.task1;

public class Main {

    //Дан текст (строка). Найти наибольшее количество подряд идущих пробелов в нем
    public static void main(String[] args) {
        String str = "Строка     с  разным                 количеством                      пробелов    в      ней";
        //System.out.println(countChars(array));
    }

    public static int countChars(char[]array){
        int counter = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] == ' '){
                counter++;
            }
        }
        return counter;
  }
}
