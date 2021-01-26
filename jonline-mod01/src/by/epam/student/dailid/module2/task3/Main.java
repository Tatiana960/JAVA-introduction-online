package by.epam.student.dailid.module2.task3;

public class Main {
    public static void main(String[] args) {
        //Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
        //положительных и нулевых элементов.
        int a[] = new int[]{-15,8,9,109,-6,123,110,1009,666,999,105,0,62,99,1010};
       int zero = 0;
       int neg = 0;
       int pos = 0;


        for (int i = 0; i < a.length; i++){
            if(a[i]==0){
                zero++;
            }
            if(a[i] <0){
                neg++;
            }
            if(a[i] > 0){
                pos++;
            }
        }
        System.out.println("Отрицательных чисел в массиве :" + neg + ", чисел с нулевым значением: " + zero +
                " , положительных чисел: " + pos);

    }
}
