import java.util.Scanner;
public class DepositarDinero {
    public static void depositar(Scanner scanner) {
                System.out.println("Ingrese la cantidad a depositar: ");

        double deposito = scanner.nextDouble();
        if (deposito>0){
            cuenta.saldo+=deposito;
            System.out.println("Has depositado $" + deposito + " correctamente. Tu nuevo saldo es: "+ cuenta.saldo);

        } else{
        System.out.println("La cantidad a depositar debe ser mayor a $0.00");

    }
}
}
