import java.util.*;

class ConsumoCriticoException extends Exception {
    public ConsumoCriticoException(String mensaje) {
        super(mensaje);
    }
}

public class MonitorCPU {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Set<Double> registrosCPU = new HashSet<>();
            final int UMBRAL_CRITICO = 95;
            System.out.println("Ingresa el consumo de CPU de los servidores (%). Escribe 'salir' para terminar.");

            while (true) {
                System.out.print(">> ");
                String entrada = scanner.nextLine().trim();

                if (entrada.equalsIgnoreCase("salir")) {
                    break;
                }

                try {
                    double valor = Double.parseDouble(entrada);

                    if (valor < 0 || valor > 100) {
                        System.out.println("❌ Valor fuera de rango (0-100). Intenta de nuevo.");
                        continue;
                    }

                    if (registrosCPU.contains(valor)) {
                        System.out.println("⚠️ Registro duplicado. No se agregó.");
                        continue;
                    }

                    if (valor > UMBRAL_CRITICO) {
                        throw new ConsumoCriticoException("🚨 Alerta: consumo crítico detectado (" + valor + "%)");
                    }

                    registrosCPU.add(valor);
                    System.out.println("✅ Registro agregado correctamente.");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Entrada inválida. Debes ingresar un número.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("\n📊 Resumen de registros válidos:");
            for (double v : registrosCPU) {
                System.out.println("Servidor: " + v + "% de CPU");
            }

        } finally {
            System.out.println("\n🔒 Recursos cerrados correctamente.");
        }
    }
}
