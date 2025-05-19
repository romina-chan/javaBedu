// Interfaz para manejar transiciones entre escenas
interface TransicionHistoria {
    void transicionar(String decision);
}

// Interfaz para mostrar o manejar diálogos
interface GestorDialogo {
    void mostrarDialogo(String texto);
}

// Interfaz para manejar lógica de decisiones
interface LogicaDecision {
    String obtenerDecision();
}

// Implementación concreta de transición
class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("🌅 Transición: Entras al bosque encantado...");
        } else if (decision.equalsIgnoreCase("B")) {
            System.out.println("🌃 Transición: Tomas el camino hacia el castillo abandonado...");
        } else {
            System.out.println("❓ Transición: Te quedas en el lugar sin hacer nada.");
        }
    }
}

// Implementación concreta de diálogos
class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println("🗣️ Diálogo: " + texto);
    }
}

// Implementación concreta de decisiones binarias (A/B)
import java.util.Scanner;
class DecisionBinaria implements LogicaDecision {
    @Override
    public String obtenerDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción: (A) Ir al bosque | (B) Ir al castillo");
        return scanner.nextLine().trim().toUpperCase();
    }
}
