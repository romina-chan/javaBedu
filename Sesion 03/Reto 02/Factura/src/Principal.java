public class Principal {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Factura sin RFC (null)
        Factura facturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);

        // Imprimir resúmenes
        System.out.println("Factura 1:");
        System.out.println(facturaConRFC.getResumen());

        System.out.println("\nFactura 2:");
        System.out.println(facturaSinRFC.getResumen());
    }
}
