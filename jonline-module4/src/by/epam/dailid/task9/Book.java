package by.epam.dailid.task9;

import by.epam.dailid.task8.Customer;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable{
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private Date yearPublished;
    private int quantityOfPages;
    private String typeOfBinding;

    public Book(int id, String title, String author, String publisher, int price, Date yearPublished,
                 int quantityOfPages, String typeOfBinding){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearPublished = yearPublished;
        this.quantityOfPages = quantityOfPages;
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                price == book.price &&
                quantityOfPages == book.quantityOfPages &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(yearPublished, book.yearPublished) &&
                Objects.equals(typeOfBinding, book.typeOfBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publisher, price, yearPublished, quantityOfPages, typeOfBinding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", yearPublished=" + yearPublished +
                ", quantityOfPages=" + quantityOfPages +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Date yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
