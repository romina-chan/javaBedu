import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Registro {

    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens"); // muestra repetida (replicada)

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Dra. García");

        // Paso 4: Mostrar resultados

        // Mostrar lista completa y ordenada de muestras
        System.out.println("📥 Orden de llegada de muestras:");
        for (String especie : muestras) {
            System.out.println("- " + especie);
        }

        System.out.println();

        // Mostrar especies únicas procesadas
        System.out.println("🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println();

        // Mostrar ID de muestra → investigador
        System.out.println("🧑‍🔬 Registro de muestras por investigador:");
        for (String id : idInvestigador.keySet()) {
            System.out.println(id + " → " + idInvestigador.get(id));
        }

        System.out.println();

        // Búsqueda por ID específica
        String idBuscado = "M-002";
        if (idInvestigador.containsKey(idBuscado)) {
            System.out.println("🔍 Búsqueda por ID '" + idBuscado + "':");
            System.out.println("Investigador responsable: " + idInvestigador.get(idBuscado));
        } else {
            System.out.println("❌ No se encontró información para el ID: " + idBuscado);
        }
    }
}
