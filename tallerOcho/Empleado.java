package tallerOcho;

public class Empleado {
    String nombre;
    int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

class Gerente extends Empleado {
    String departamento;

    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}

class main3 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", 5000);
        Gerente g1 = new Gerente("Ayleen", 7000, "Tecnologico");
        e1.mostrarDetalles();
        g1.mostrarDetalles();
    }
}
