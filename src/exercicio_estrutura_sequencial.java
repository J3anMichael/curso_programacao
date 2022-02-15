import java.util.Scanner;

public class exercicio_estrutura_sequencial {
    public static void main(String[] args) {

        // Exercício 1
        // Fazer um programa para ler as medidas da largura e comprimento de um terreno
        // retangular e imprimir a área do terreno e em seguida, o preço a pagar por metro.

        Scanner sc = new Scanner(System.in);

        double largura, comprimento, preco;
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        System.out.println("AREA = " + (largura * comprimento));
        preco = sc.nextDouble();
        System.out.println("PRECO = " + (largura * comprimento * preco));


        sc.close();

    }
}
