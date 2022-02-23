import java.util.Scanner;

public class exercicio_while_4 {
    public static void main(String[] args) {

        // Criar um programa para ler idades e no final somar todas as idades e mostrar a média.

        Scanner sc = new Scanner(System.in);


        int qtdIdades = 0;
        int somaIdades = 0;

        System.out.println("Digite as idades: ");
        int idade = sc.nextInt();
        qtdIdades++;
        while (idade > 0) {
                System.out.println("Digite as idades: ");
                idade = sc.nextInt();
                qtdIdades++;
                somaIdades = somaIdades + idade;
        }
        System.out.println("A média de idades é: " + (somaIdades / qtdIdades));

        sc.close();
    }
}
