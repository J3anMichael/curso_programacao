import java.util.Scanner;

public class exercicio_while_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        System.out.println("Digite a opção de reabastecimento: ");
        int opcao = sc.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                gasolina++;
            } else if (opcao == 2){
                alcool++;
            } else if (opcao == 0){
                diesel++;
            } else {
                System.out.println("Opção invalida...");

            }
            opcao = sc.nextInt();

        }
        System.out.println("Muito obrigado!");
        System.out.println("Gasolina " + gasolina);
        System.out.println("Gasolina " + alcool);
        System.out.println("Gasolina " + diesel);


        sc.close();
        }



    }

