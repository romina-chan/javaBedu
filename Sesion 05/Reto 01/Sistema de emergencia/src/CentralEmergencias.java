public class CentralEmergencias {
    public static void main(String[] args) {
        Operador operadorAmbulancia = new Operador("Juan", "👷");
        Operador operadorPatrulla = new Operador("Laura", "👮");
        Operador operadorBomberos = new Operador("Marco", "👨‍🚒");

        Ambulancia ambulancia = new Ambulancia("Ambulancia", operadorAmbulancia);
        Patrulla patrulla = new Patrulla("Patrulla", operadorPatrulla);
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", operadorBomberos);

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}
