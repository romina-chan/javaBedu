public class mainNarrativa {

    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    // Constructor recibe solo interfaces (DIP)
    public mainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Te encuentras en una encrucijada misteriosa...");
        String eleccion = decision.obtenerDecision();
        transicion.transicionar(eleccion);
        dialogo.mostrarDialogo("Continúa la aventura según tu elección...");
    }

    // Método main
    public static void main(String[] args) {
        // Inyección de dependencias
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        mainNarrativa narrativa = new mainNarrativa(transicion, dialogo, decision);
        narrativa.ejecutarEscena();
    }
}
