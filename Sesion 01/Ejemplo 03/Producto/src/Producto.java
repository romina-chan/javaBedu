public class Producto {
    // Atributos
    String nombre;
    double precio;

    // Constructor
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodos
    public void mostrarInformacion(){
        System.out.println("Producto: " + nombre + " - Precio: $" + String.format("%,.2f", precio));
    }
}
