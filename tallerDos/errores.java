package tallerDos;

public class errores {
    private String nombre;

    /*
     * public static void mostrarNombre(){
     * System.out.println(this.nombre);
     * }
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;

        this.mostrarNombre();
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
