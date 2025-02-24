package tallerOchoMedio;

public class B {

    public void mostrar() {
        System.out.println("Método de la clase base");
    }
}

class Main4 {
    public static void main(String[] args) {
        // super.mostrar();
    }
}
////////////////////////////////////////////////////////////////////

class Base {
    private String mensaje = "Hola";

    public String obtenerMensaje() {
        return mensaje;
    }
}

class Derivada extends Base {
    public void mostrarMensaje() {
        // System.out.println(super.mensaje);
    }
}

class Main5 {
    public static void main(String[] args) {
        Derivada o1 = new Derivada();
        o1.mostrarMensaje();
    }
}
