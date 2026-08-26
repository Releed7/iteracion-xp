public class CalculadorEnvio {

    public static double calcularCostoEnvio(double importePedido) {
        if (importePedido >= 1000.0) {
            return 0.0;
        }
        if (importePedido >= 500.0) {
            return 50.0;
        }
        return 100.0;
    }
}