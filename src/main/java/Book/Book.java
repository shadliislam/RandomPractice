package Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Book {
    private String bookTitle;
    public double bookPrice;

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
    public abstract void print();

    @Override
    public String toString() {
        return "Book.Book { Title='" + bookTitle + '\'' + ", Price=" + bookPrice +'}';
    }
}


