import java.util.Optional;

public class Factura {
    // Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    // Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        // Si el RFC es null, usamos Optional.empty()
        this.rfc = (rfc == null) ? Optional.empty() : Optional.of(rfc);
    }

    // Método público para mostrar el resumen
    public String getResumen() {
        String resumen = "Descripción: " + descripcion +
                "\nMonto: $" + monto +
                "\nRFC: " + (rfc.isPresent() ? rfc.get() : "[No proporcionado]");
        return resumen;
    }
}

