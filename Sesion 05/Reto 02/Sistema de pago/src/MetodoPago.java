public abstract class MetodoPago {
    double monto;

    // Inicializar
    public MetodoPago(double monto){
        this.monto = monto;
    }

    // Metodo abstracto
    public abstract void procesarPago();
    // Metodo concreto
    public void mostrarResumen() {
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }

    }
