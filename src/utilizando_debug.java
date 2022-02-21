import java.util.Scanner;

public class utilizando_debug {
    public static void main(String[] args) {
        // Como utilizar o Debug.
        // IDE utilizada: IntelliJ IDEA.


        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metrosQuadrados = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metrosQuadrados;

        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Preco = %.2f%n", preco);

        sc.close();

    }
}
