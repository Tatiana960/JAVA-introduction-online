package by.epam.student.dailid.module2.task5;

public class Main {
    //Даны целые числа(a1...an). Вывести на печать только те числа, для которых ai > i
    public static void main(String[] args) {
        int a[] = new int[] {34, 89,45,899,10,0,4,2,9};

        for (int i = 0; i < a.length; i++){
            if(a[i] > i){
                System.out.println("Числа, для которых ai > i :" + a[i]);
            }
        }

    }
}
