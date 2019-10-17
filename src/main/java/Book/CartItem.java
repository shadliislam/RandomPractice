package Book;

import java.util.Objects;

public class CartItem {
    Book book;
    int count;
    private double ItemTotalPrice;

    public CartItem(Book book, int count) {
        this.book = book;
        this.count = count;
        this.ItemTotalPrice=this.book.getBookPrice()*this.count;
    }

    public Book getBook() {
        return book;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        this.ItemTotalPrice=book.getBookPrice()*this.count;
    }

    public double getPrice() {
        return this.ItemTotalPrice;
    }

    @Override
    public String toString() {
        return "'"+book.getBookTitle()+"'"+", Unit Price: $"+book.getBookPrice()+", quantity: "+getCount()+", price: $"+getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartItem)) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(book, cartItem.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book);
    }
}
