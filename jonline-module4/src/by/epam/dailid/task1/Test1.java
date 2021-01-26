package by.epam.dailid.task1;

public class Test1 {
    //Создайте класс Test1  двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте
    //метод, который находит сумму значений этих переменных и метод, который находит наибольшее значение из этих
    //двух переменных
    private int a;
    private int b;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setA(20);
        test1.setB(12);
        int a = test1.a;
        int b = test1.b;
        printVariables(a, b);
        sumOfVariables(a, b);
        theBiggestVariable(a, b);
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public  int getA(){
        return a;
    }
    public  int getB(){
        return b;
    }

    public static void printVariables(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    public static void sumOfVariables(int a, int b){
        int sum;
        sum = a + b;
        System.out.println("Сумма переменных: " + sum);
    }
    public static void theBiggestVariable(int a, int b){
        if(a > b){
            System.out.println("a > b");
        }
        else{
            System.out.println("b > a");
        }
    }

}
