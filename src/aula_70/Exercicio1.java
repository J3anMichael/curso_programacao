package aula_70;


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Medidas medidas = new Medidas();

        System.out.println("Enter rectangle width and height: ");
        System.out.print("Width: ");
        medidas.width = sc.nextDouble();
        System.out.print("Height: ");
        medidas.height = sc.nextDouble();
        System.out.println();

        System.out.println("Area: " + medidas.area());
        System.out.println("Perimeter: " + medidas.perimeter());
        System.out.println("Diagonal: " + medidas.diagonal());




        sc.close();
    }
}
