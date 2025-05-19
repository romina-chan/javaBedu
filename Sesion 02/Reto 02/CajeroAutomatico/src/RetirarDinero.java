import java.util.Scanner;

public class RetirarDinero {
    public static void retirar(Scanner scanner) {
        System.out.print("¿Cuánto deseas retirar?: ");
        double retiro = scanner.nextDouble();
        if (retiro > 0 && retiro <= cuenta.saldo) {
            cuenta.saldo -= retiro;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}

