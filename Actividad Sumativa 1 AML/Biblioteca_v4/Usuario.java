package Biblioteca_v4;

// Clase Usuario
class Usuario extends Persona {
    private String numeroIdentificacion;
    private String direccionCorreo;

    public Usuario(String nombre, String apellido, String numeroIdentificacion, String direccionCorreo) {
        super(nombre, apellido);
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccionCorreo = direccionCorreo;
    }

    // Getters y Setters
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }
}