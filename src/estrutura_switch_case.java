import java.util.Scanner;

public class estrutura_switch_case {
    public static void main(String[] args) {
        // Sintaxe opcional: Estrutura Switch-Case;

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
        }
        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}