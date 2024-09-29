package Biblioteca_v3;
import java.time.LocalDate;

// Clase Autor
class Autor extends Persona {
    private LocalDate fechaNacimiento;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
