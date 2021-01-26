package by.epam.student.dailid.module1;

import org.w3c.dom.ls.LSOutput;

public class ex7 {
    public static void main(String[] args) {
        //в n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом
        // бидоне на 12 л больше молока, чем в малом?

        int n = 10;//количество бидонов n
        int capacity = 80; //количество молока в n бидонах
        int x = capacity/n;//количество молока в одном n-бидоне
        int y = capacity/(x+12);//количество m-бидонов
        int m = capacity/y;
        System.out.println("Количество молока в m бидоне: " + m);
        }

    }

