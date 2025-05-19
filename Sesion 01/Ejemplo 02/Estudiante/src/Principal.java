public class Principal {
    public static void main(String [] args){
        // Crear un nuevo objeto del tipo Estudiante
        Estudiante estudiante1 = new Estudiante();

        // Asignar valores a los atributos
        estudiante1.nombre = "Romina";
        estudiante1.edad =23;

        // Llamar al método saludar() del objeto

        estudiante1.saludar();
    }
}
