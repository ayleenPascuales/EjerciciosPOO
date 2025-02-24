package tallerNueve;

interface Nadador {
    public void nadar();

}

interface Respirador {
    public void respirar();
}

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El pez nada.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira.");
    }
}

class prueba {
    public static void main(String[] args) {
        Pez p1 = new Pez();
        p1.respirar();
        p1.nadar();
    }
}
