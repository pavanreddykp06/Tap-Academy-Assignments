import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
}

public class BookObjectArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[2];

        for (int i = 0; i < books.length; i++) {

            books[i] = new Book();

            System.out.println("Enter title:");
            books[i].title = sc.nextLine();

            System.out.println("Enter author:");
            books[i].author = sc.nextLine();

            System.out.println("Enter price:");
            books[i].price = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nBook Details:");

        for (Book b : books) {
            System.out.println(b.title + " - " + b.author + " - " + b.price);
        }
    }
}