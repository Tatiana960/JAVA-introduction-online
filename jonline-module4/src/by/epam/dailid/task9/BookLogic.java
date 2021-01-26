package by.epam.dailid.task9;
import java.util.Collections;
import java.util.List;

public class BookLogic {

    public List<Book> sortBooksByAuthor(List books){
        Collections.sort(books);

        return books;
    }
}
