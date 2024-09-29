package actSum_1_G7;

public class Main {
    public static void main(String[] args) {
        // Crear un autor
        Autor autor = new Autor("Robert", "Martin", "17 de diciembre de 1952", "Estadounidense");

        // Crear un libro usando el autor creado
        Libro libro = new Libro("Clean Code: A Handbook of Agile Software Craftsmanship", "978-0132350884", 2008, autor);

        // Datos del libro
        System.out.println("Datos del libro:");
        libro.imprimirDatosLibro();

        // usuario activo
        Usuario usuario = new Usuario("Nombre", "Apellido", "19181911-0", "xxx@mail.com");

        // Imprimir los datos del usuario
        System.out.println("\nDatos del usuario:");
        usuario.imprimirDatosUsuario();
    }
}

