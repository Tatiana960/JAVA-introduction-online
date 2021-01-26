package by.epam.dailid.sorting.task4;

public class Main {
    //Сортировка обменами. Дана последовательность чисел a1 <= a2<=...<=an. Требуется переставить числа в порядке
    // возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается перестановка.
    //Так продолжается до тех пор, пока все элементы не будут расположены в порядке возрастания. Составить алгоритм
    // сортировки, подсчитывая при этом количество перестановок.
    public static void main(String[] args) {
        int [] array = new int[]{1, 3, 5, 2, 7, 4, 8, 6, 9};
        int count = 0;
        System.out.println("Массив до сортировки: ");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = array[i];
                array[i] = min;
                array[min_i] = tmp;
                count++;
            }

        }
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            System.out.println();
        }
            System.out.println("Количество перестановок :" + count);
        }
    }

