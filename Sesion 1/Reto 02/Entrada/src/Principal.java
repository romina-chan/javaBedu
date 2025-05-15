public class Principal {
    public static void main (String[] args){
        // Crear un objeto de tipo Entrada

        Entrada entrada1 = new Entrada ("Obra de Teatro", 450.99);
        Entrada entrada2 = new Entrada ("Concierto", 3785.99);

        // Llamar al método para mostrar la informacion del evento
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    }
}
