package Biblioteca_v4;

// Clase Libro
class Libro {
    private String titulo;
    private String ISBN;
    private int anoPublicacion;
    private Autor autor;

    public Libro(String titulo, String ISBN, int anoPublicacion, Autor autor) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.anoPublicacion = anoPublicacion;
        this.autor = autor;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
