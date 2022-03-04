package entities;

public class Triangle {

        public double a;
        public double b;
        public double c;

        // metodo para calcular a area do triangulo
        public double area() {
            double p = (a + b + c) / 2.0; // calcula a medida da hipotenusa
            return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // calcula a area
        }
    }

