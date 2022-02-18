import java.util.Scanner;

public class esxopo_e_inicializacao {
    public static void main(String[] args) {

        // Escopo e Inicialização;

        Scanner sc = new Scanner(System.in);
        double price = 200.00;
        double discount = 5.00;

        sc.nextDouble();
        if (price < 200.00) {
            discount = price * 0.01;
        } else {
            discount = price * 0.05;
        }
        System.out.println("Valor total: R$" + (price - discount));

        sc.close();
    }
}
