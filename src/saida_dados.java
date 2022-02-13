import java.util.Locale;

public class saida_dados {
    public static void main(String[] args){
        //code...

        // Sem quebra de linha;
        // System.out.print("Sem quebra de linnha!");

        // Com quebra de linha:
        // System.out.println("Com quebra de linha!");

        int x = 14;
        double y = 10.35784;

        //System.out.print("O valor de X é: ");
        System.out.println(y);
        System.out.printf("%.2f%n", y); // Casas decimais
        Locale.setDefault(Locale.US);   // Adiciona . ao inves de ,
        System.out.printf("%.4f%n", y);

        // Como concatenar:
        System.out.println("O valor de Y é: " + y);
        // ou
        System.out.printf("O valor de Y é: %.2f%n", y);


        // Utilizando marcadores de variaveis

        // %f = ponto flutuante;
        // %d = inteiro;
        // %s = texto;
        // %n = quebra de linha.

        String nome = "Jean Michael";
        int idade = 25;
        double renda = 2000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
    }
}
