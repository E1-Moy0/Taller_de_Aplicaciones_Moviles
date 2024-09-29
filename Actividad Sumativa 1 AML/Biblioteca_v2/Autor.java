package Biblioteca_v2;
import java.util.Date;

// Clase Autor
class Autor extends Persona {
    private Date fechaNacimiento;
    private String nacionalidad;

    public Autor(String nombre, String apellido, Date fechaNacimiento, String nacionalidad) {
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
