package tallerNueve;

interface Animal {
    void hacerSonido();
}

/*
 * public class C implements Animal {
 * 
 * }
 * 
 * class Main6 {
 * public static void main(String[] args) {
 * C c1 = new C();
 * }
 * }
 */
///////////////////////////////////////////////////////////////
interface volador {
    void volar();
}

class Pez implements volador {
    public void volar() {
        System.out.println("El pez... ¿vuela? ");
    }
}
