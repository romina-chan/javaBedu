public class Main {
    public static void main(String[] args) {
        // Crear declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700);

        // Crear cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500);

        // Mostrar información
        System.out.println("🧾 Declaración:");
        System.out.println("RFC: " + declaracion.rfcContribuyente());
        System.out.println("Monto declarado: $" + declaracion.montoDeclarado());

        System.out.println("\n💼 Cuenta Fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar RFC
        System.out.println("\n✅ ¿RFCs coinciden?: " + cuenta.validarRFC(declaracion));
    }
}
