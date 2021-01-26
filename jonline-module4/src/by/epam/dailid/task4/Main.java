package by.epam.dailid.task4;

import java.util.Arrays;
import java.util.*;

public class Main{
    //Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
    //данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
    //Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность
    // сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены
    // по времени отправления
    public static void main(String[] args) {

        Train trains[] = new Train[6];

        trains[0] = new Train("Minsk", 6827, (float) 10.12);
        trains[1] = new Train("Moscow", 4712, (float) 14.14);
        trains[2] = new Train("Tula", 4562, (float) 17.48);
        trains[3] = new Train("Moscow", 8978, (float) 17.25);
        trains[4] = new Train("Kazan", 7879, (float) 21.35);
        trains[5] = new Train("Moscow", 3341, (float) 17.25);

        System.out.println("Исходный массив: ");

        for (Train tr : trains) {
            System.out.println(tr);
        }
        Train sortTrain[] = sortArray(trains);
        showArray(sortTrain);
        findTrain(trains);
        Train train2[] = compare(trains);
        System.out.println("Сортировка поездов по месту назначения: ");
        for (Train t : train2) {
            System.out.println(t);
        }
    }
    public static Train[] sortArray(Train trains[]) {
        Train test;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < trains.length; i++) {
                for (int j = i + 1; j < trains.length; j++) {
                    if (trains[i].getNumOfTrain() > trains[j].getNumOfTrain()) {
                        isSorted = false;
                        test = trains[i];
                        trains[i] = trains[j];
                        trains[j] = test;
                    }
                }
            }
        }
        return trains;
    }

    public static void showArray(Train sorttrain[]) {
        System.out.println("Сортировка поездов по номеру");
        for (Train tr : sorttrain) {
            System.out.println(tr);
        }
    }

    public static void findTrain(Train trains[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер поезда ");
        while (!sc.hasNextInt()) {
            System.out.println("Неверно, попробуйте еще раз");
            sc.next();
        }
        int number = sc.nextInt();
        for (Train tr : trains) {
            if (tr.getNumOfTrain() == number) {
                System.out.println("Информация о поезде: " + tr);
            }
        }
    }

    public static Train[] compare(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                int result = trains[i].getFinalDestination().compareTo(trains[j].getFinalDestination());
                if (result == 0) {
                    if (trains[i].getTimeOfDeparture() > trains[j].getTimeOfDeparture()) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
                    if (result > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }return trains;
        }
    }




