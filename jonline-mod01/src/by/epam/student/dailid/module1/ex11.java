package by.epam.student.dailid.module1;
import java.lang.Math;
public class ex11 {
    public static void main(String[] args) {
        //найти max{min(a,b), min(c,d)}.
        int a = 8;
        int b = 7;
        int c = 12;
        int d = 1;
        int temp, temp2, temp3;
        if (a < b) {
            temp = a;
        } else temp = b;

        if (c < d){
            temp2 = c;
        }else temp2 = d;
        if (temp > temp2){
            temp3 = temp;
        }else temp3 = temp2;
        System.out.println(temp3);
    }
}
