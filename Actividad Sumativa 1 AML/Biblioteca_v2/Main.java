package Biblioteca_v2;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear autor
        Autor autor = new Autor("Robert", "Martin", new Date(52, 11, 17), "Estadounidense");

        // Crear libro
        Libro libro = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship",
                "978-0132350884", 2008, autor);

        // Crear usuario
        Usuario usuario = new Usuario("NombreUsuario", "ApellidoUsuario", "123456789", "usuario@example.com");

        // Imprimir datos del libro y usuario
        System.out.println("Datos del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Año de publicación: " + libro.getAnioPublicacion());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
        System.out.println("Fecha de nacimiento del autor: " + libro.getAutor().getFechaNacimiento());
        System.out.println("Nacionalidad del autor: " + libro.getAutor().getNacionalidad());

        System.out.println("\nDatos del usuario:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Identificación: " + usuario.getIdentificacion());
        System.out.println("Correo electrónico: " + usuario.getCorreoElectronico());
    }
}