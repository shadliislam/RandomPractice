package Book;

import java.util.ArrayList;

public class Fiction extends Book {

    public Fiction(String bookTitle) {
        super(bookTitle);
    }

    public void setPrice(double bookPrice) {
        super.bookPrice=bookPrice;
    }

    public void print() {
        System.out.println("Book.Fiction Book.Book Name: "+getBookTitle()+" and price: $"+getBookPrice());
    }

    @Override
    public String toString() {
        return "Book.Fiction "+super.toString();
    }

    public void printAll(ArrayList<Book> bookGUIS){
        for (Book bookGUI : bookGUIS){
            if (bookGUI instanceof Fiction) {
                System.out.println("Name of the book" + bookGUI.getBookTitle() + "and price $" + bookGUI.getBookPrice());
            }
        }

    }
}

