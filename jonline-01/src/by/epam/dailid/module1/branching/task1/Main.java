package by.epam.dailid.module1.branching.task1;

public class Main {
    public static void main(String[] args) {
        //даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
        //будет ли он прямоугольным.
        int a = 12;//первый угол треугольника
        int b = 89;//второй угол треугольника
        int sum = 180;//сумма трех углов треугольника равна 180 градусов.
        int c = sum - (a + b);
        if(c < 0){
            System.out.println("Такого треугольника не существует");
            return;
        }else {
            System.out.println("Такой треугольник существует");
        }

        if(c==90){
            System.out.println("Треугольник является прямоугольным");
        }else {
            System.out.println("Треугольник не является прямоугольным");
        }
    }

}
