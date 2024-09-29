package Biblioteca;
// Clase Usuario que hereda de Persona
class Usuario extends Persona {
    // Atributos
    private String identificacion;
    private String correoElectronico;

    // Constructor
    public Usuario(String nombre, String apellido, String identificacion, String correoElectronico) {
        super(nombre, apellido);
        this.identificacion = identificacion;
        this.correoElectronico = correoElectronico;
    }

    // Método para imprimir los datos del usuario
    public void imprimirDatosUsuario() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo electrónico: " + correoElectronico);
    }
}
