package tallerTres;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);

        System.out.println("Edad: " + persona1.edad);

        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("Nuevo nombre: " + persona1.getNombre());

        persona1.mostrarInfo();
    }

}
