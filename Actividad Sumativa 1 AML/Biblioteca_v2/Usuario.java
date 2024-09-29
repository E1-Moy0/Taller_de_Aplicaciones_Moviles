package Biblioteca_v2;

// Clase Usuario
class Usuario extends Persona {
    private String identificacion;
    private String correoElectronico;

    public Usuario(String nombre, String apellido, String identificacion, String correoElectronico) {
        super(nombre, apellido);
        this.identificacion = identificacion;
        this.correoElectronico = correoElectronico;
    }

    // Getters y Setters
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
