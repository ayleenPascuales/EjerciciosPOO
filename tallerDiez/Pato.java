package tallerDiez;

interface Volador {
    public void volar();
}

interface Nadador {
    public void nadar();
}

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato vuela.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada.");
    }
}

class mostrarPato {
    public static void main(String[] args) {
        Pato verde = new Pato();
        verde.volar();
        verde.nadar();
    }
}
