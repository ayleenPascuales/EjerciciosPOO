package tallerCinco;

public class Empleado {
    protected String nombre;
    protected double salario;

    public void mostrarInfo() {
        System.out.println("Empleado:");
        System.out.println("Juan");
        System.out.println("5000000");
    }
}

class Gerente extends Empleado {
    String departamento;

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente: ");
        System.out.println("Pedro ");
        System.out.println("10000000");
        System.out.println("Logistico");
    }
}

class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Gerente g1 = new Gerente();
        e1.mostrarInfo();
        g1.mostrarInfo();
    }
}
