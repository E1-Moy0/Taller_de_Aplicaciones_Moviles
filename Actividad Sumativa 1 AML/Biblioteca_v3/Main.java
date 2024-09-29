package Biblioteca_v3;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        // Crear Autor
        Autor autor = new Autor("Robert", "Martin", LocalDate.of(1952, 12, 17), "Estadounidense");

        // Crear Libro
        Libro libro = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship",
                "978-0132350884", 2008, autor);

        // Crear Usuario
        Usuario usuario = new Usuario("NombreUsuario", "ApellidoUsuario", "123456789", "usuario@example.com");

        // Imprimir datos del libro y del usuario
        System.out.println("Datos del Libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Año de publicación: " + libro.getAnioPublicacion());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
        System.out.println("Fecha de nacimiento del autor: " + libro.getAutor().getFechaNacimiento());
        System.out.println("Nacionalidad del autor: " + libro.getAutor().getNacionalidad());

        System.out.println("\nDatos del Usuario:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Número de identificación: " + usuario.getNumeroIdentificacion());
        System.out.println("Dirección de correo electrónico: " + usuario.getDireccionCorreo());
    }
}
