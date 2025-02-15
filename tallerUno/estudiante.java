package tallerUno;

public class estudiante {
    String nombre;
    int edad;
    String curso;

    public estudiante() {
        nombre = "Mariana ponce";
        edad = 4;
        curso = "kinder";
    }

    public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;

    }

    public String toString() {
        return "Estudiante { Nombre del estudiante: " + nombre +
                ", Edad del estudiante: " + edad +
                ", Curso del estudiante: " + curso + "}";
    }

}
