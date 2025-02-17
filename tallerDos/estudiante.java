package tallerDos;

public class estudiante {
    String nombre;
    int edad;

    public estudiante() {
        this("Mariana", 4);
    }

    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public static void main(String[] args) {
        estudiante estu = new estudiante();
        estu.mostrarDatos();
    }
}
