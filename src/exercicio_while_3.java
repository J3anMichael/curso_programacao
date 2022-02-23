import java.util.Scanner;

public class exercicio_while_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Faça um algoritmo de soma de produtos no carrinho


        int blusa = 0;
        int jaqueta = 0;
        int calca = 0;

        System.out.println("Escolha seus produtos: ");

        int produto = sc.nextInt(); // variavel que recebe o codigo do produto

        while(produto != 4){
            if(produto == 1){
                blusa++;
            } else if (produto == 2){
                jaqueta++;
            } else if (produto == 3){
                calca++;
            } else {
                System.out.println("O produto não existe, escolha um novo produto: ");
            }
            produto = sc.nextInt();
        }

        System.out.println("Produtos selecionados: ");
        System.out.println("Blusa:  " + blusa);
        System.out.println("Jaqueta:  " + jaqueta);
        System.out.println("Calça:  " + calca);

        sc.close();

    }
}
