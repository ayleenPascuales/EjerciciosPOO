package tallerTresMedio;

class Carro {
    public void mover() {
        System.out.println("El carro se mueve");
    }
}

class Moto extends Carro {
    public void mover() {
        System.out.println("La moto avanza");
    }
}

class Prueba1 {
    public static void main(String[] args) {
        Carro miCoche = new Carro();
        miCoche.mover();
    }
}
