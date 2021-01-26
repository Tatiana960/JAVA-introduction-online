package by.epam.dailid.task9;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    /*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и  get- методы, и метод
    * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
    * Задать критерии выбора данных и вывести эти данные на консоль.
    *
    * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    * Найти и вывести:
    * а) список книг заданного автора
    * б) список книг, выпущенных заданным издательством
    * в) список книг, выпущенных после заданного года */
        public static void main(String[] args) {
            List<Book> books = new ArrayList<Book>();
        Book b1 = new Book(12, "Java", "Ekkel", "Piter", 250,
                new Date(2015,1,1), 1168, "cardboard");
        Book b2 = new Book(34, "C#", "Skit", "Manning", 350,
                new Date(2012,1,1), 1000, "cardboard");
        Book b3 = new Book(45, "Clean Code", "Martin", "Piter", 450,
                new Date(2019,1,1), 464, "cardboard");
        Book b4 = new Book(112, "Design patterns", "Friman ", "Piter", 350,
                new Date(2011,1,1), 656, "cardboard");
        Book b5 = new Book(112, "Java", "Shildt", "Piter", 150,
                new Date(2015,1,1), 1100, "cardboard");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);


    }
}
