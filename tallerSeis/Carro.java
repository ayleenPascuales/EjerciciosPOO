package tallerSeis;

public class Carro {
    String marca;
    String modelo;
    static int contadorCarros = 0;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCarros++;
    }

    public static int getContadorCarros() {
        return contadorCarros;
    }
}

class Prueba10 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "Corolla");
        Carro c2 = new Carro("Honda", "Civic");
        Carro c3 = new Carro("Ford", "Focus");

        System.out.println("Número total de carros   creados: " + Carro.getContadorCarros());
    }
}
