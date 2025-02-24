package tallerNueve;

interface Volador {
    public void volar();
}

interface Cantante {
    public void cantar();
}

public class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El ave vuela.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave canta.");
    }
}

class Main6 {
    public static void main(String[] args) {
        Ave azulejo = new Ave();
        azulejo.cantar();
        azulejo.volar();
    }
}
