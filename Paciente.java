package hospital;

public class Paciente {
    // Atributos
    String nombre;
    int edad;
    String numeroExpediente;

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Información del paciente: ");
        System.out.println("Nombre del paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}