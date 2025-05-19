public class Principal {
    public static void main(String[] args){
        // Crear un nuevo objeto de tipo Paciente

        Paciente paciente = new Paciente();

        // Asigna valores a los pacientes
        paciente.nombre = "Romina";
        paciente.edad = 23;
        paciente.NumeroExpediente = "280601";

        // Llamar al método mostrarInformación() del objeto

       paciente.mostrarInformacion();


    }
}
