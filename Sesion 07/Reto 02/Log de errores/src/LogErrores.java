import java.io.*;

public class LogErrores {

    public static void main(String[] args) {
        // Ruta del archivo de logs a analizar
        String rutaArchivo = "errores.log";

        // Contadores para el resumen
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        // try-with-resources asegura que el archivo se cierre automáticamente
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Leer cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                // Contamos si la línea contiene "ERROR"
                if (linea.contains("ERROR")) {
                    errores++;
                }

                // Contamos si la línea contiene "WARNING"
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resumen del análisis
            System.out.println("📋 Resumen del análisis de logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + errores);
            System.out.println("Cantidad de advertencias: " + advertencias);

            // Calcular y mostrar porcentajes
            double porcentajeErrores = (totalLineas > 0) ? ((double) errores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) advertencias / totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
            guardarErrorEnArchivo(e.getMessage());
        }
    }

    // Método auxiliar para guardar el mensaje de error en un archivo
    public static void guardarErrorEnArchivo(String mensajeError) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("registro_fallos.txt"))) {
            escritor.write("Error al procesar el archivo de logs:\n");
            escritor.write(mensajeError);
            System.out.println("📝 Mensaje de error guardado en registro_fallos.txt");
        } catch (IOException e) {
            System.out.println("❌ No se pudo guardar el error en archivo: " + e.getMessage());
        }
    }
}
