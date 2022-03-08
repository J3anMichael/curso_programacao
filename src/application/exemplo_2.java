package application;
import java.util.Scanner;
import entities.Product;

public class exemplo_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextInt();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("product data: " + product.toString());

        System.out.println("Enter the number of product to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        System.out.println("Enter the number of product to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());





        sc.close();


    }
}
