import java.util.Scanner;

public class expressao_condicional_ternaria {
    public static void main(String[] args) {

        // Expressão Condicional Ternaria;

        Scanner sc = new Scanner(System.in);
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        sc.nextInt();
        System.out.println(desconto);

        sc.close();
    }
}
