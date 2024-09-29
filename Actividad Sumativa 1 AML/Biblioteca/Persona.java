package Biblioteca;
// Clase Persona
class Persona {
    // Atributos comunes
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}