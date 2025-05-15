public class Paciente {
    // Datos del paciente - Declarar atributos
    String nombre;
    int edad;
    String NumeroExpediente;

    // Método que muestra la información del paciente

    public void mostrarInformacion(){
        System.out.println ("Paciente: " + nombre);
        System.out.println ("Edad: " + edad);
        System.out.println ("Expediente: " + NumeroExpediente);
}}
