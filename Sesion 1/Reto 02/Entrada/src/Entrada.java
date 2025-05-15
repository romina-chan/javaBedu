public class Entrada {
    // Atributos
    String nombreEvento;
    double precioEntrada;

    // Constructor
    public Entrada (String nombreEvento, double precioEntrada){
    this.nombreEvento = nombreEvento;
    this.precioEntrada = precioEntrada;
    }

    // Metodos
    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + String.format("%,.2f", precioEntrada));
    }

}
