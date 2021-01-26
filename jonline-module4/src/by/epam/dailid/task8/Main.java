package by.epam.dailid.task8;

import java.util.*;

public class Main {
    //Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set-, get-методы, и метод
   // toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    // а)список покупателей в алфавитном порядке;
    // б)список покупателей, у которых номер кредитной карточки находится в заданном интервале.

    public static void main(String[] args) {


        List<Customer> group = new ArrayList<Customer>();


        Customer a = new Customer(011, "Ivanov", "Ivan", "Minsk", 1234345656,
                456);
        group.add(a);
        Customer b = new Customer(113, "Petrov", "Pyotr", "Molodechno", 455567893,
                554);
        group.add(b);
        Customer c = new Customer(1, "Sidorov", "Fyodor", "Drozdy", 1234345689,
                321);
        group.add(c);
        Customer d = new Customer(214, "Pushkin", "Aleksandr", "Moscow", 1234347878,
                458);
        group.add(d);
        Customer e = new Customer(45, "Gogol", "Nikolay", "Sorochincy", 1234345689,
                222);
        group.add(e);

        System.out.println(group);

        Collections.sort(group, new CustomerSurnameComparator());

        System.out.println(group);

        CustomerCreditCardNumberComparator cr = new CustomerCreditCardNumberComparator();

        List <Customer> newlist = new ArrayList<Customer>();

        newlist = cr.CustomerCreditCardCheck(group);

        System.out.println("Список клиентов с номерами кредитных карт в диапазоне 1000000000 до 2000000000: ");

        System.out.println(newlist);


    }

}
