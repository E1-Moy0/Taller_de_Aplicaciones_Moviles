package Biblioteca;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear un autor
        Autor autor = new Autor("Robert", "Martin", LocalDate.of(1952, 12, 17), "Estadounidense");

        // Crear un libro con el autor creado
        Libro libro = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship", "978-0132350884", 2008, autor);

        // Imprimir los datos del libro
        System.out.println("Datos del libro:");
        libro.imprimirDatosLibro();

        // Crear un usuario activo
        Usuario usuario = new Usuario("NombreUsuario", "ApellidoUsuario", "123456789", "usuario@example.com");

        // Imprimir los datos del usuario
        System.out.println("\nDatos del usuario:");
        usuario.imprimirDatosUsuario();
    }
}