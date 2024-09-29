package Biblioteca_v4;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear autor
        Autor autor = new Autor("Robert", "Martin", LocalDate.of(1952, 12, 17), "Estadounidense");

        // Crear libro
        Libro libro = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship",
                                "978-0132350884",
                                2008,
                                autor);

        // Crear usuario
        Usuario usuario = new Usuario("John", "Doe", "123456789", "john.doe@example.com");

        // Imprimir datos del libro
        System.out.println("Datos del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Año de publicación: " + libro.getAnoPublicacion());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
        System.out.println("Fecha de nacimiento del autor: " + libro.getAutor().getFechaNacimiento());
        System.out.println("Nacionalidad del autor: " + libro.getAutor().getNacionalidad());

        // Imprimir datos del usuario
        System.out.println("\nDatos del usuario:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Número de identificación: " + usuario.getNumeroIdentificacion());
        System.out.println("Dirección de correo electrónico: " + usuario.getDireccionCorreo());
    }
}
