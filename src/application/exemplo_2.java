package application;
import java.util.Scanner;
import entities.Product;

public class exemplo_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextInt();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();






        sc.close();


    }
}
