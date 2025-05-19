import java.util.Scanner;

public class SimuladorFarmacia {
 public static void main(String[] args){

     // Uso de Scanner para que el usuario pueda ingresar la información
     Scanner scanner = new Scanner(System.in);

     System.out.print("¡Bienvenido a Farmacias Guadalajara! Introduce el medicamento que deseas comprar: ");
     var nombreMedicamento = scanner.nextLine();

     System.out.print("Introduce el precio del medicamento que deseas comprar: ");
     double precioUnitario = scanner.nextDouble();

     System.out.print("Introduce la cantidad de piezas que deseas comprar: ");
     int cantidadPiezas = scanner.nextInt();

          // Métodos - Cálculos
     // Calcular el total sin descuento
     double total = (precioUnitario*cantidadPiezas);

     // Calcular el descuento
     boolean aplicaDescuento = total >= 500;

     // condición ? valor_si_verdadero : valor_si_falso;
     double descuento = aplicaDescuento ? total*0.15 : 0;

     double totalFinal = total - descuento;



     // Imprimir los valores almacenados en las variables
     System.out.println("Medicamento: " + nombreMedicamento);
     System.out.println("Cantidad: " + cantidadPiezas);
     System.out.println("Precio unitario: $" + precioUnitario);
     System.out.println("¿Aplica descuento?: " + aplicaDescuento);
     System.out.println("Descuento: " + descuento);
     System.out.println("Total a pagar: " + totalFinal);
 }


}
