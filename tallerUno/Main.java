package tallerUno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // libros
        System.out.println("Ingrese el nombre del libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        System.out.println("Ingrese el numero de paginas del libro: ");
        int numPaginas = sc.nextInt();

        libro l1 = new libro(titulo, autor, numPaginas);
        System.out.println("Libro: " + l1.toString());

        // cuenta bancaria
        System.out.println("Ingrese numero de cuenta: ");
        String numCuenta = sc.nextLine();
        System.out.println("Ingrese tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        System.out.println("Ingrese el saldo: ");
        int saldo = sc.nextInt();

        cuentaBancaria cb = new cuentaBancaria(numCuenta, tipoCuenta, saldo);
        System.out.println("Cuenta bancaria: " + cb.toString());

        // estudiante
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el curso del estudiante: ");
        String curso = sc.nextLine();

        estudiante estu = new estudiante(nombre, edad, curso);
        System.out.println("Estudiante: " + estu.toString());

        sc.close();
    }
}
