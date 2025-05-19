public class Principal {

    public static void main (String []args){

        //Crear los datos que vamos a pedir despues
        Entrada evento1 = new Entrada("Obra de teatro", 450.00);
        Entrada evento2 = new Entrada("DPR TOUR", 450.00);

        //Llamar al método para mostrar la información del producto
        evento1.mostrarInformacion();
        evento2.mostrarInformacion();

    }
}
