import java.util.Locale;

public class exercicio_fixacao_saida_dados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 25;
        int code = 5290;
        char gender = 'M';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);

        System.out.print("Record: ");
        System.out.print(age + " years old, code " + code + " and gender: " + gender);
        System.out.println("");
        System.out.printf("Measure with eight decimal places: %.8f %n ", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n ", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);




    }
}
