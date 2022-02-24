import java.util.Scanner;

public class exercicio_for_2 {
    public static void main(String[] args) {

//   Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//   Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//   essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas repetições: ");
        int n = sc.nextInt(); // quantidade de repetições
        int in = 0; // quantidade de numeros dentro do intervalo
        int out = 0; // quantidade de numeros fora do intervalo

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }

        }
        System.out.println("in: " + in);
        System.out.println("out: " + out);

        sc.close();
    }
}
