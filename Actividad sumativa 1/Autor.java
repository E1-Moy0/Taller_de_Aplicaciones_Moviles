package actSum_1_G7;

// Clase Autor que hereda de Persona
class Autor extends Persona {
    // Atributos de la clase
    private String fechaNacimiento;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String apellido, String fechaNacimiento, String nacionalidad) {
        //Se usa super al ser una extension de la clase persona para no tener que "reprogamar" los atributos en el constructor de esta clase
        super(nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getter para obtener la fecha de nacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Getter para obtener la nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }
}
