package Book;

import java.util.ArrayList;

public class NonFiction extends Book {
    public NonFiction(String bookTitle) {
        super(bookTitle);
    }

    public void setPrice(double bookPrice) {
        super.bookPrice=bookPrice;
    }

    public void print(){
        System.out.println("Book.NonFiction Book.Book Name: "+getBookTitle()+" and price: $"+getBookPrice());
    }

    public void printAll(ArrayList<Book> bookGUIS){
        for (Book bookGUI : bookGUIS){
            if (bookGUI instanceof NonFiction) {
                System.out.println("Name of the book" + bookGUI.getBookTitle() + "and price $" + bookGUI.getBookPrice());
            }
        }
    }
    @Override
    public String toString() {
        return "Non-Book.Fiction "+super.toString();
    }

}
