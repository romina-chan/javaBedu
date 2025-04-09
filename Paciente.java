public class Paciente {
    //Atributos
    String nombre;
    int edad;
    String numeroExp;

    //Métodos pra mostrar la información del paciente
    /* 1. Tipo de regreso
     * 2. Nombre
     * 3. Parámetros (con su tipo) */

    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExp);
    }
}