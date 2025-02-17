package tallerDos;

public class producto {
    String nombre;
    int precio;

    public producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Producto: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    public static void main(String[] args) {
        producto p = new producto("Bolsa de arroz", 2500);
        p.mostrarProducto();
    }
}
