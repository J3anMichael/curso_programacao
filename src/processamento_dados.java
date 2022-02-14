public class processamento_dados {
    public static void main(String[] args){
        // Processamento de dados e casting

        // Comando de atribuição & Casting

        // Sintaxe:
        // variavel = expressão;

        // Exemplo 1
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        // Exemplo 2

        int a;
        double b;

        a = 5;
        b = 2 * a;

        System.out.println(a);
        System.out.printf("%.3f", b);
        System.out.println();

        // exemplo 3

        double bb, BB, h, area;

        bb = 6.0;
        BB = 8.0;
        h = 5.0;

        area = (bb + BB) / 2.0 * h;

        System.out.println(area);

        // Exemplo 4 Casting

        int aaa, bbb;
        double resultado;

        resultado = (double) a / b; // (double) é o casting, que está convertendo a varíavel do tipo inteiro para double.

        System.out.println(resultado);

        // Exemplo 5

        double a1;
        int b1;

        a1 = 5.0;
        b1 = (int) a;

        System.out.println(b);

    }
}
