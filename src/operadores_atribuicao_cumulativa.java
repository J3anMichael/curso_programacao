import java.util.Scanner;

public class operadores_atribuicao_cumulativa {
    public static void main(String[] args) {
        // Sintaxe opcional - Operadores de atribuição cumulativa.

        Scanner sc = new Scanner(System.in);

        double plano = 50.00;
        int minutosPlano = 100;
        double multaPorMinuto = 2.0;
        int tempo;

        // Como eu faria:

//        System.out.println("Digite o tempo de utilização do plano: ");
//         tempo = sc.nextInt();
//
//         if (tempo > minutosPlano) {
//             System.out.println("O valor total a pagar: R$" + (plano + (tempo - 100) * multaPorMinuto));
//         } else {
//             System.out.println("O valor total do plano é de: R$" + plano);
//         }


            // Com operadores de atribuição cumulativa:
            tempo = sc.nextInt();
            if (tempo > minutosPlano) {
                plano += (tempo - minutosPlano) * multaPorMinuto;
            }

            System.out.printf("Valor da conta: R$%.2f", plano);






        sc.close();

     }
}
