package by.epam.student.dailid.module1;

public class ex19 {
    public static void main(String[] args) {
        //вычислить значение функции

            double x = 4;
            double f = 0;

            if(x <= 3) {
                f = x * x - 3 * x + 9;
            } else if (x > 3){
                f = 1/(x*x*x + 6);
            }
            System.out.println("Значение функции при x = " + x + " равно " + f);
        }
    }


