import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;
}

public class ProductObjectArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int n = sc.nextInt();
        sc.nextLine();   

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {

            products[i] = new Product();   

            System.out.println("Enter Product ID:");
            products[i].productId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Product Name:");
            products[i].productName = sc.nextLine();

            System.out.println("Enter Price:");
            products[i].price = sc.nextDouble();

            System.out.println("Enter Quantity:");
            products[i].quantity = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nProduct Details:");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].productId + " " + products[i].productName + " " + products[i].price + " " + products[i].quantity);
        }
    }
}
