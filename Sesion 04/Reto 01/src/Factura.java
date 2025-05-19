import java.util.Objects;
public class Factura {

    // Atributos
    String folio;
    String cliente;
    double total;

    // Constructor que inicialice todos los atributos
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    // Sobrescribimos equals() para comparar contenido
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otro = (Factura) obj;
        return this.folio.equals(otro.folio);} // solo comparamos el folio

    // hashCode() compatible con equals()
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }

    // toString() para ver fácilmente la información del ticket
    @Override
    public String toString() {
        return "\uD83E\uDDFE Factura [" +
                "folio='" + folio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", total=$ =" + total + "]";
    }
}
