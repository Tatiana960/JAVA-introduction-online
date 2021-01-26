package by.epam.student.dailid.module1;

public class ex23 {
    //Дан числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен заданному e.
    public static void main(String[] args) {
        double e = 0.5;
        double sum = 0;
        int n = 10;
        double a;

        for (int i = 1; i < n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e){
                sum += a;
            }
        }
        System.out.println("Сумма членов ряда, модуль которых >= " + e + " равна " + sum);
    }
}
