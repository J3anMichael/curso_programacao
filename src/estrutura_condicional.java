import java.util.Scanner;

public class estrutura_condicional {
    public static void main(String[] args) {
        // Estrutura Condicional (IF-ELSE)

        // Sintaxe:

        Scanner sc = new Scanner(System.in);
          int x;

          x = sc.nextInt();

          if (x <= 12) {
            System.out.println("Bom dia! ");
        } else if (x >= 12 && x <= 18) {
            System.out.println("Boa tarde! ");
        } else  {
            System.out.println("Boa noite! ");
        }


          sc.close();
    }
}
