public abstract class UnidadEmergencia {

    // Atributos
    String nombre;

    public UnidadEmergencia (String nombre){
        this.nombre=nombre;
    }
    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }

    public abstract void responder();


    public class SistemaGPS {
        public void localizar() {
            System.out.println("📍 GPS: Ubicación actual detectada.");
        }
    }

    public class Sirena {
        public void activarSirena() {
            System.out.println("🔊 Sirena: Activada.");
        }
    }


    public class Operador {
        private String nombre;
        private String emoji;

        public Operador(String nombre, String emoji) {
            this.nombre = nombre;
            this.emoji = emoji;
        }

        public void reportarse() {
            System.out.println(emoji + " Operador " + nombre + " reportándose.");
        }
    }


    public void reportarse() {
            System.out.println("👨‍💼 Operador " + nombre + " reportándose al mando.");
        }
    }

}

