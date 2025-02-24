package tallerCinco;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}

class Moto extends Vehiculo {
    protected int cilindrada;

    public Moto(String marca, int cilindrada) {
        super("moto", marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Cilindrada: " + cilindrada + "cc");
    }
}

class Prueba9 {
    public static void main(String[] args) {
        Moto moto = new Moto("Yamaha", 600);
        moto.mostrarDatos();

        // Vehiculo vehiculo = new Vehiculo("Coche", "Toyota");
        // System.out.println(vehiculo.tipo);
        // System.out.println(vehiculo.marca);
    }
}
