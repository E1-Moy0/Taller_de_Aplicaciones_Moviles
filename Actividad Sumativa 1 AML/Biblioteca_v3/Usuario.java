package Biblioteca_v3;

// Clase Usuario
class Usuario extends Persona {
    private String numeroIdentificacion;
    private String direccionCorreo;

    // Constructor
    public Usuario(String nombre, String apellido, String numeroIdentificacion, String direccionCorreo) {
        super(nombre, apellido);
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccionCorreo = direccionCorreo;
    }

    // Getters
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }
}