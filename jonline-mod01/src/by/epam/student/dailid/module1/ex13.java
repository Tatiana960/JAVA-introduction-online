package by.epam.student.dailid.module1;

public class ex13 {
    public static void main(String[] args) {
//Заданы размеры А, В прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие
        double A = 12;//длина прямоугольника
        double B = 7;//ширина прямоугольника
        double x = 5;//длина кирпича
        double y = 8;//ширина кирпича
        double z = 9;//высота кирпича
        if(A > z && B > y){
            System.out.println("Кирпич пройдет через отверстие");
        } else System.out.println("Кирпич не пройдет через отверстие");

    }
    }

