import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args){
        // Entrada de dados

        Scanner sc = new Scanner(System.in);

//        String x;
//        x = sc.next();
//        System.out.println("Você digitou: " + x);

//        int x;
//
//        x = sc.nextInt();
//        System.out.println("Você digitou: " + x);

//          double x;
//
//          x = sc.nextDouble();
//          System.out.printf("Você digitou: %.2f%n", x );

//           char x;
//
//           x = sc.next().charAt(0);
//           System.out.println("Você digitou: " + x);

             // Para ler vários dados na mesma linha

            String x;
            int y;
            double z;

            x = sc.next();
            y = sc.nextInt();
            z = sc.nextDouble();

            System.out.println("Dados digitados: ");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);


           sc.close();
    }
}
