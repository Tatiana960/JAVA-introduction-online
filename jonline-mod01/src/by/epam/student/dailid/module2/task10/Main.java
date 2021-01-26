package by.epam.student.dailid.module2.task10;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int [] a = new int[] {1,2,3,4,5,6,7,8,9};
        for(int i = 1; i < a.length; i=i+2){
            a[i] = 0;
        }
        System.out.println("Измененный массив: " + Arrays.toString(a));
    }
}
