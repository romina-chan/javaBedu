public class Principal {
    public static void main(String[] args){
        // Creamos dos tickets con el mismo folio pero diferentes clientes
        Factura t1 = new Factura("FAC001", "Juan Pérez", 1450);
        Factura t2 = new Factura("FAC001", "Comercial XYZ", 1450);

        // Comparación con equals()
        System.out.println("¿Son iguales? " + t1.equals(t2));  // true

        // Hash codes
        System.out.println("Hash de Factura 1: " + t1.hashCode());
        System.out.println("Hash de Factura 2: " + t2.hashCode());

        // Representación legible del objeto
        System.out.println(t1);
        System.out.println(t2);
    }
}
