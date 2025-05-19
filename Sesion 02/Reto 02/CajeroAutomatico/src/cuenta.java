import java.util.Scanner;

public class cuenta {
    public static double saldo = 1000;
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
// Atributos
      int opcion;

// Interfaz del menú
       do{
           System.out.println("Bienvenido al cajero automático. Digite la opción deseada");
           System.out.println("1. Consultar saldo");
           System.out.println("2. Depositar dinero");
           System.out.println("3. Retirar dinero");
           System.out.println("4. Salir");
           opcion = scanner.nextInt();

           switch (opcion){
               case 1:
                   ConsultarSaldo.Consultar();
                   break;
               case 2:
                   DepositarDinero.depositar(scanner);
                   break;
               case 3:
                   RetirarDinero.retirar(scanner);
                   break;
               case 4:
                   System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                   break;
               default:
                   System.out.println("Opción inválida. Intente de nuevo.");
           }

       } while (opcion !=4);
       scanner.close();

    }
}
