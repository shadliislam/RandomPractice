package Book;

import java.util.*;

public class MapBook {
    public static void main(String[] args) {
        HashMap<String, Book> books=new HashMap<String,Book>();
        getBookInfo(books);
        printBook(books);
    }

    public static void getBookInfo(HashMap<String, Book> books){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Insert the total number of books: ");
        int numOfBooks=scanner.nextInt();
        for (int inputCount=0;inputCount<numOfBooks;inputCount++){
            System.out.println("Insert type of books ('F' for Book.Fiction, 'N' for Non-Book.Fiction): ");
            String bookType=scanner.next();
            System.out.println("Insert Book.Book name: ");
            String bookName = scanner.next();
            System.out.println("Insert Book.Book price: ");
            Double price = scanner.nextDouble();
            if(bookType.equalsIgnoreCase("F")) {
                Book fiction = new Fiction(bookName);
                fiction.setPrice(price);
                books.put(bookType,fiction);
            } else if(bookType.equalsIgnoreCase("N")){
                Book nonFiction = new NonFiction(bookName);
                nonFiction.setPrice(price);
                books.put(bookType,nonFiction);
            }
        }
    }

    public static void printBook(HashMap<String, Book> books){
         for (String key : books.keySet()) {
            System.out.println("------------------------------------------------");
            System.out.println(books.get(key));
        }
    }
}
