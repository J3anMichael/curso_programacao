import java.util.Scanner;

public class estrutura_while {
    public static void main(String[] args) {

        // Fazer um programa que lê números inteiros até que um zero seja lido.
        // Ao final, mostrar a soma dos números lidos.

        Scanner sc = new Scanner(System.in);


        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }

        System.out.println("A soma dos números digitados: " + soma);

        sc.close();
    }
}
