import java.util.Scanner;
public class Principal {
    public static void main (String [] args){
        // Crear Scanner para leer desde consola

        Scanner sc = new Scanner(System.in);
// Crear mis objetos
        // 1. La clase a la que pertenece el objeto
        // 2. Identificador
        // 3. new + constructuctor

        // Crear un objeto de tipo Paciente
        Paciente paciente = new Paciente();

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre del paciente: ");

        System.out.print("Ingrese la edad del paciente: ");


        System.out.print("Ingrese el número de expediente: ");


        // Mostrar información
        System.out.println("\n📋 Información del paciente:");
        paciente.mostrarInformacion();

        // Cerrar Scanner
        sc.close();
    }

    }

