import java.util.Scanner;

public class estrutura_do_while {

    public static void main(String[] args) {

        // Estrutura repetitiva - Do While(Faça-enquanto).

        // Sintaxe:
        // do {
        //     // Comandos a serem executados.
        // } while (condição);

        // O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.


        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("A temperatura em Fahrenheit é: %.1f%n", F);

            System.out.println("Deseja repetir (s/n)? ");
             resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
