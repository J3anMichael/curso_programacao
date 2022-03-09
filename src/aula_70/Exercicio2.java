package aula_70;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.next();
        System.out.println("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.println("Which percentage to increase salarary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println();

        System.out.println("Updated: " + employee);
        sc.close();

    }
}
