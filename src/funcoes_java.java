import java.util.Scanner;

public class funcoes_java {
    public static void main(String[] args) {
        // Funções em Java.

         /*
            Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.
         */

        // Declaração de variáveis.
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Enter three numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int biggest = max(num1, num2, num3);

        ShowBiggest(biggest);

        sc.close();

    }
    // Função para encontrar o maior número.
    public static int max(int x, int y, int z){
        int aux; // Variável que vai receber o resultado da comparação.
        if(x > y && x > z){
            aux = x;
        } else if(y > z){
            aux = y;
        } else {
            aux = z;
        }
        return aux; // Retorna o maior número.
    }
    // Função para mostrar o maior número.
    public static void ShowBiggest(int value){
        System.out.println("The biggest number is: " + value);
    }
}
