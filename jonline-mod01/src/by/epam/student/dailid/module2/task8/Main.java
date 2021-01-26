package by.epam.student.dailid.module2.task8;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
public class Main {
    //дана последовательность целых чисел а1, а2,,,an. Образовать новую последовательность, выбросив из исходной
    // те члены, которые равны min(a1,a2...an).
    public static void main(String[] args) {
        int []a = new int[]{2,6,8,9,3,45,678,3,2,9};
        System.out.println("Массив до изменений: " + Arrays.toString(a));

            int count = 0;
            int result = 0;
            int min = a[0];
        for(int i = 0; i < a.length;i++) {
                if (a[i] < min) {
                   min = a[i];
                }
            }
                for(int value : a) {
                    if (value == min) {
                        count++;
                    }
                }
              int[] res = new int[a.length - count];
                int indexResult = 0;
                for(int i = 0; i < a.length;i++){
                    if(a[i]!=min){
                        res[indexResult] = a[i];
                        indexResult++;
                    }
                }
            System.out.println("Массив после изменения: " + Arrays.toString(res));
        }
        }



