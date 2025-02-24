package tallerDiez;

import java.security.cert.TrustAnchor;

public abstract class Figura {
    public abstract double calcularArea();
}

class Rectangulo extends Figura {
    int ancho, alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

}

class Triangulo extends Figura {
    int base, altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

}

class mostrar {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(30, 65);
        Triangulo t1 = new Triangulo(56, 21);
        System.out.println("Area del rectangulo: " + r1.calcularArea());
        System.out.println("Area del triangulo: " + t1.calcularArea());
    }
}