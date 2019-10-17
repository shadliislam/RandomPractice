package Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PreDefinedListBook {
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<Book> myBookList=new ArrayList<Book>();
    public void getBookInfo(){
        String[] fictionBookName={"The First Animals","Harry Potter","Inception","The Godfather"};
        double[] fictionBookPrice={12.3,30.5,60,59};
        for (int index=0;index<fictionBookName.length;index++){
            Book fiction=new Fiction(fictionBookName[index]);
            fiction.setPrice(fictionBookPrice[index]);
            myBookList.add(fiction);
        }
        String[] nonFictionBookName={"A Brief History of Time","Never Cry Wolf","Alive","War and Peace"};
        double[] nonFictionBookPrice={22.4,43.5,56.6,55.7};
        for (int index=0;index<nonFictionBookName.length;index++){
            Book nonFiction=new NonFiction(nonFictionBookName[index]);
            nonFiction.setPrice(nonFictionBookPrice[index]);
            myBookList.add(nonFiction);
        }
    }
    public void calculateTotalPrice(){
        ArrayList<CartItem> myCartItems = new ArrayList<CartItem>();
        System.out.print("List of books: "+'\n');
        for (Book book:myBookList){
            System.out.println(book.toString());
        }
        System.out.println("");
        String keepShopping="y";
        double sum=0.0;
        int totaltem=0;
        do {
            System.out.print("Enter the name of the item from the list of book: ");
            String newBookName = scanner.nextLine();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            for (Book book:myBookList){
                if (book.getBookTitle().equalsIgnoreCase(newBookName)){
                    CartItem cartItem = new CartItem(book,quantity);
                    if(myCartItems.contains(cartItem)){
                        int itemIndex = myCartItems.indexOf(cartItem);
                        CartItem oldCartItem = myCartItems.get(itemIndex);
                        cartItem.setCount(oldCartItem.getCount()+cartItem.getCount());
                        myCartItems.remove(itemIndex);
                    }
                    myCartItems.add(cartItem);
                }
            }
            System.out.println("***********************************");
            System.out.println("Books you have selected: ");
            sum=0;

            for(CartItem cartItem:myCartItems){
                System.out.println(cartItem.toString());
                sum+=cartItem.getPrice();
                totaltem+=cartItem.getCount();
            }
            System.out.println("***********************************");
            System.out.print("Add to Cart (y/n)? ");
            keepShopping = scanner.nextLine();
        }
        while (keepShopping.equalsIgnoreCase("y"));
        System.out.println();
        System.out.println("Final Shopping Cart Number of Books: "+ totaltem+" totals Price: $" +sum);
    }
}

