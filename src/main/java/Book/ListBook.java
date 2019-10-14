package Book;
import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<Book>();
        getBookInfo(books);
        printBook(books);
        calculateTotalPrice(books);
    }
    public static void getBookInfo(ArrayList<Book> books){
        System.out.println("Insert the total number of books: ");
        int numOfBooks=scanner.nextInt();
        for (int inputCount=0;inputCount<numOfBooks;inputCount++){
            System.out.println("Insert type of books ('F' for Fiction, 'N' for Non-Fiction): ");
            String bookType=scanner.next();
            System.out.println("Insert Book name: ");
            String bookName = scanner.next();
            System.out.println("Insert Book price: ");
            Double price = scanner.nextDouble();
            if(bookType.equalsIgnoreCase("F")) {
                Book fiction = new Fiction(bookName);
                fiction.setPrice(price);
                books.add(fiction);
            } else if(bookType.equalsIgnoreCase("N")){
                Book nonFiction = new NonFiction(bookName);
                nonFiction.setPrice(price);
                books.add(nonFiction);
            }
        }
    }
    public static void printBook(ArrayList<Book> books){
        for (Book book:books){
            if (book instanceof NonFiction) {
                System.out.println("------------------------------------------------");
                System.out.println("Name of the NonFiction book: " +"'"+book.getBookTitle()+"'"+ ", and price: $" + book.getBookPrice());
            }
            if (book instanceof Fiction) {
                System.out.println("------------------------------------------------");
                System.out.println("Name of the Fiction book: " +"'"+book.getBookTitle()+"'"+ ", and price: $" + book.getBookPrice());
            }
        }
        System.out.println("------------------------------------------------");
    }
    public static void calculateTotalPrice(ArrayList<Book> books){
        System.out.println('\n'+"List of books: "+'\n');
        for (Book book:books){
            System.out.println(book.toString());
        }
        System.out.println("How many books you wanna select? ");
        int bookNum=scanner.nextInt();
        double sum=0;
        for(int i=0;i<bookNum;i++) {
            System.out.println("Type your desired book name from the above list:");
            String bookName = scanner.next();
            for (Book book:books){
                if (book.getBookTitle().equalsIgnoreCase(bookName)){
                    sum+=book.getBookPrice();
                }
            }
        }
        System.out.println("Total cost of your selected books= $"+sum);
    }
}
