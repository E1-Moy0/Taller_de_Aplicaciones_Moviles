package Biblioteca;
import java.time.LocalDate;

// Clase Autor que hereda de Persona
class Autor extends Persona {
    // Atributos específicos
    private LocalDate fechaNacimiento;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Método para obtener la fecha de nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para obtener la nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }
}