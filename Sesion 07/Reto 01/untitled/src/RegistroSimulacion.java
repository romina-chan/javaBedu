import java.io.IOException;
import java.nio.file.*;

public class RegistroSimulacion {

    // Metodo principal
    public static void main(String[] args) {
        // Ruta del archivo dentro de la carpeta 'config'
        Path rutaArchivo = Paths.get("config/parametros.txt");

        // Llamamos al método para guardar los parámetros
        guardarParametros(rutaArchivo);

        // Validamos si el archivo fue creado correctamente
        if (Files.exists(rutaArchivo)) {
            System.out.println("✅ El archivo fue creado correctamente.\n");
            // Si existe, lo leemos y mostramos
            leerParametros(rutaArchivo);
        } else {
            System.out.println("❌ El archivo no fue creado.");
        }
    }

    // Método para guardar los parámetros de simulación
    public static void guardarParametros(Path rutaArchivo) {
        try {
            // Creamos la carpeta 'config' si no existe
            Files.createDirectories(rutaArchivo.getParent());

            // Contenido del archivo
            String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            // Escribimos los parámetros en el archivo
            Files.writeString(rutaArchivo, parametros);
            System.out.println("📁 Parámetros guardados en: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar los parámetros: " + e.getMessage());
        }
    }

    // Método para leer el contenido del archivo
    public static void leerParametros(Path rutaArchivo) {
        try {
            String contenido = Files.readString(rutaArchivo);
            System.out.println("📄 Contenido del archivo:");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }
    }
}
