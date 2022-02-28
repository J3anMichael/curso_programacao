public class funcoes_interessantes_string {
    public static void main(String[] args) {

        // Checklist:
        // 1. String.length() - retorna o tamanho da string
        // 2. String.charAt(int) - retorna o caractere na posição int
        // 3. String.indexOf(char) - retorna a posição do caractere
        // 4. String.indexOf(String) - retorna a posição da string
        // 5. String.replace(char, char) - substitui o caractere por outro
        // 6. String.replace(String, String) - substitui a string por outra
        // 7. String.toLowerCase() - converte para minusculo
        // 8. String.toUpperCase() - converte para maiusculo
        // 9. String.substring(int, int) - retorna uma substring da string
        // 10. String.trim() - remove espaços em branco no inicio e fim da string
        // 11. String.split(char) - divide a string em um array de strings
        // 12. String.split(String) - divide a string em um array de strings
        // 13. String.contains(String) - verifica se a string contém outra string
        // 14. String.startsWith(String) - verifica se a string começa com outra string
        // 15. String.endsWith(String) - verifica se a string termina com outra string
        // 16. String.equals(String) - verifica se duas strings são iguais
        // 17. String.equalsIgnoreCase(String) - verifica se duas strings são iguais ignorando maiusculas e minusculas
        // 18. String.compareTo(String) - compara duas strings
        // 19. String.compareToIgnoreCase(String) - compara duas strings ignorando maiusculas e minusculas
        // 20. String.isEmpty() - verifica se a string é vazia

        // Exemplos:

        String original = "abcde FGHIJ ABC abc DEFG    ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(3);
        String s05 = original.substring(3, 7);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        String s08 = original.replace("   ", " ");
        String s09 = original.replace("DEF", "xyz");
        String s10 = original.replace("def", "xyz");


        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(s08);
        System.out.println(s09);
        System.out.println(s10);

    }
}
