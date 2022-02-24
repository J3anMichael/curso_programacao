import java.util.Scanner;

public class estrutura_for {
    public static void main(String[] args) {

        // Quando usar?
        // Quando se sabe previamente o número de repetições que serão feitas.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // número de repetições
        int soma = 0;

        for ( int i = 0; i < n; i++ ) { // i é a variável incio, em quanto i for menor que n, ou seja número de repetições, ele vai incrementando mais 1 a i.
            int x = sc.nextInt(); // valor a ser somado
            soma = soma + x;
        }

        System.out.println(soma);





        sc.close();
    }

}

