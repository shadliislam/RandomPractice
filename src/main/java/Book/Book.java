package Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public abstract class Book {
    private String bookTitle;
    public double bookPrice;
    //public int quantity;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.bookPrice = 0.0;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public double getBookPrice(){
        return bookPrice;
    }

    public abstract void setPrice(double bookPrice);
    @Override
    public String toString() {
        return "Book {Title='" + bookTitle + '\'' + ", Price= $" + bookPrice +'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle);
    }
}


