package hospital;

import java.util.Scanner;

public class Principal {
    public static void main (String [] args){

        // Crear Scanner para leer desde consola
        Scanner input = new Scanner(System.in);

        // Crear los datos que vamos a pedir despues
        Paciente p1 = new Paciente();

        // Pedir datos al usuario
        System.out.print("Ingrese el nombre del paciente: ");
        p1.nombre = input.nextLine();

        System.out.println("Ingrese la edad: ");
        p1.edad = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese número del expediente: ");
        p1.numeroExpediente = input.nextLine();

        input.close();

        p1.mostrarInformacion();
    }

    }

