package tallerSiete;

public abstract class Empleado {

    abstract double calcularSalario();

    public void mostrarSalario() {
        System.out.println("El salario del empleado es: " + calcularSalario());
    }

}

class Gerente extends Empleado {
    int salario;
    int horasTrabajadas;

    public Gerente(int salario, int horasTrabajadas) {
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return salario * horasTrabajadas;
    }

}

class Vendedor extends Empleado {
    int salario;
    int horasTrabajadas;

    public Vendedor(int salario, int horasTrabajadas) {
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return salario * horasTrabajadas;
    }
}

class mostrarTodo {
    public static void main(String[] args) {
        Gerente g1 = new Gerente(6500, 50);
        Vendedor v1 = new Vendedor(4000, 40);
        g1.mostrarSalario();
        v1.mostrarSalario();
    }
}
