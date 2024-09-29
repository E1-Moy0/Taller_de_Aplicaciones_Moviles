package actSum_1_G7;

// Clase Usuario que hereda de Persona
class Usuario extends Persona {
    // Atributos de la clase
    private String identificacion;
    private String correoElectronico;

    // Constructor
    public Usuario(String nombre, String apellido, String identificacion, String correoElectronico) {
        //Se usa super al ser una extension de la clase persona para no tener que "reprogamar" los atributos en el constructor de esta clase
        super(nombre, apellido);
        this.identificacion = identificacion;
        this.correoElectronico = correoElectronico;
    }

    // Imprimir los datos del usuario
    public void imprimirDatosUsuario() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo electrónico: " + correoElectronico);
    }
}