import java.util.Scanner;

public class esxopo_e_inicializacao {
    public static void main(String[] args) {

        // Escopo e Inicialização;

        Scanner sc = new Scanner(System.in);
        double price;
        double discount = 0.5;
        double total;

        price = sc.nextDouble();
        if (price > 100) {
            total = price - (price * discount);
        } else {
            total = price;
        }
        System.out.println(total);
        sc.close();
    }
}
