package tallerTres;

class producto {
    String nombre;
    double precio;
    int stock;

    producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Articulo: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}

class PruebaProducto {
    public static void main(String[] args) {
        producto producto1 = new producto("Laptop", 1500.99, 10);
        producto1.mostrarInfo();
    }
}
