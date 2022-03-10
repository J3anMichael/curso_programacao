package aula_70;

import javax.xml.namespace.QName;

public class Notas {
    public String nome;
    public double primeiro;
    public double segundo ;
    public double terceiro;

    public double notaFinal() {
        return (primeiro + segundo + terceiro);
    }

    public double missingPoints() {
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }






}
