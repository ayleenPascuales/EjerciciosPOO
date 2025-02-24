package tallerOcho;

class A {
    void metodoA() {
        System.out.println("Método de A");
    }
}

class B {
    void metodoB() {
        System.out.println("Método de B");
    }
}

/*
 * class C extends A, B {
 * void metodoC() {
 * System.out.println("Método de C");
 * }
 * }
 */

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

class Estudiante extends Persona {
    public Estudiante(String nombre) {
        super(nombre);
    }

    /*
     * public void mostrarNombre() {
     * System.out.println("Nombre: " + nombre);
     * }
     */
}
