public record Entrada (String nombreEvento, double precioEntrada){

    /* Reto 02 - Convertir la clase Entrada en un Record para ver una forma más compacta del declarar estructuras de datos en Java moderno
    Generar un nuevo archivo Entrada_Record y crea un registro extra*/

public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + String.format("%,.2f", precioEntrada));
    }
}


    /* Esto es parte del Reto 02 sin utilizar Record

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

}*/
