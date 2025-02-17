package tallerSeis;

public class estatica {
    int contador = 0;

    public static void incrementarContador() {
        // contador++;
        System.out.println("Error");
    }

    //////////////// CORREGIDO /////////////////
    public void incrementarCorrectamente() {
        contador++;
        System.out.println("Contador incrementado: " + contador);
    }
}
