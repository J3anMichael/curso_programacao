import java.util.Scanner;

public class exercicio_while {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        int senha = sc.nextInt();
//
//        while(senha != 2002){
//            System.out.println("Senha Invalida");
//            senha = sc.nextInt();
//        }
//        System.out.println("Bem Vindo!");

            System.out.println();
            int x = sc.nextInt();
            int y = sc.nextInt();

            while (x <= y) {
                System.out.println(x);
            }
        sc.close();

    }
}