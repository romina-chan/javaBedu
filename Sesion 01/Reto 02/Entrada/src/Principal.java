public class Principal {

    public static void main (String[] args){
 /* Reto 02 - Convertir la clase Entrada en un Record para ver una forma más compacta del declarar estructuras de datos en Java moderno
    Generar un nuevo archivo Entrada_Record y crea un registro extra*/

        // Crear un objeto de tipo Entrada usando el record

        Entrada entrada1 = new Entrada ("Obra de Teatro", 450.99);
        Entrada entrada2 = new Entrada ("Concierto", 3785.99);

        // Mostrar el toString() generado automaticamente por el record

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
    }
}

       /* Esto es parte del Reto 02 sin utilizar Record
        // Crear un objeto de tipo Entrada

        Entrada entrada1 = new Entrada ("Obra de Teatro", 450.99);
        Entrada entrada2 = new Entrada ("Concierto", 3785.99);

        // Llamar al método para mostrar la informacion del evento
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    }
}*/
