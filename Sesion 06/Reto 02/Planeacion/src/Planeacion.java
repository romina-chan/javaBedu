import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Clase Tema que implementa Comparable para ordenar por título
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural: por título (alfabéticamente)
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "📘 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class Planeacion {
    public static void main(String[] args) {

        // Paso 1: Lista concurrente para los temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregamos algunos temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Paso 2: Ordenar por título (alfabético)
        Collections.sort(temas);
        System.out.println(" Temas ordenados alfabeticamente:");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        System.out.println();

        // Paso 3: Ordenar por prioridad de menor a mayor
        temas.sort(Comparator.comparingInt(t -> t.prioridad));
        System.out.println("🚦 Temas ordenados por prioridad:");
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        System.out.println();

        // Paso 4: Repositorio compartido de recursos (ConcurrentHashMap)


        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

            // Mostrar todos los recursos asociados
        System.out.println("Repositorio de recursos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println("🔗 " + titulo + " → " + recursos.get(titulo));
        }
    }
}

