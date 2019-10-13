package Book;

import java.util.ArrayList;

public class NonFiction extends Book {
    public NonFiction(String bookTitle) {
        super(bookTitle);
    }

    public void setPrice(double bookPrice) {
        super.bookPrice=bookPrice;
    }

   /* public void print(){
        System.out.println("NonFiction Book Name: "+getBookTitle()+" and price: $"+getBookPrice());
    }*/

    public void printAll(ArrayList<Book> books){
        for (Book book : books){
            if (book instanceof NonFiction) {
                System.out.println("Name of the book" + book.getBookTitle() + "and price $" + book.getBookPrice());
            }
        }
    }
    @Override
    public String toString() {
        return "Non-Fiction "+super.toString();
    }

}
