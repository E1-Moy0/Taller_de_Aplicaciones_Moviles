package actSum_1_G7;

// Clase Libro
class Libro {
    // Atributos
    private String titulo;
    private String isbn;
    private int anoPublicacion;
    private Autor autor;

    // Constructor
    public Libro(String titulo, String isbn, int anoPublicacion, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anoPublicacion = anoPublicacion;
        this.autor = autor;
    }

    // Getter
    public Autor getAutor() {
        return autor;
    }

    // Imprimir los datos del libro
    public void imprimirDatosLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Año de publicación: " + anoPublicacion);
        System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellido());
        System.out.println("Fecha de nacimiento del autor: " + autor.getFechaNacimiento());
        System.out.println("Nacionalidad del autor: " + autor.getNacionalidad());
    }
}