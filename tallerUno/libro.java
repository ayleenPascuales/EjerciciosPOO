package tallerUno;

public class libro {
    String titulo;
    String autor;
    int numPaginas;

    public libro() {
        titulo = "La llamada del cthulhu";
        autor = "Howard Phillips Lovecraft";
        numPaginas = 244;
    }

    public libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPaginas);
    }

    public String toString() {
        return "Libro { Titulo: " + titulo + ", Autor: " + autor + ", Numero de paginas: " +
                numPaginas + "}";
    }

    public static void main(String[] args) {
        libro libro1 = new libro();
        libro1.mostrarDetalles();
    }
}
