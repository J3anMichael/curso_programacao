package aula_70;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Notas notas = new Notas();

        System.out.print("Nome do aluno: ");
        notas.nome = sc.nextLine();
        System.out.print("Nota do primeiro Trimestre: ");
        notas.primeiro = sc.nextDouble();
        System.out.print("Nota do segundo Trimestre: ");
        notas.segundo = sc.nextDouble();
        System.out.print("Nota do terceiro Trimestre: ");
        notas.terceiro = sc.nextDouble();
        System.out.println();

        if (notas.notaFinal() < 60.0) {
            System.out.println("Nota final: " + notas.notaFinal() + " Reprovado!");
            System.out.println("Notas em falta: " + notas.missingPoints());
        } else {
            System.out.println("Nota final: " + notas.notaFinal() + "Notas em falta: " + notas.missingPoints());
        }





        sc.close();
    }
}
