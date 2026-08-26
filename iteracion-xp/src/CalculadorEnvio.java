public class CalculadorEnvio {

    private static final double LIMITE_ENVIO_GRATIS = 1000.0;
    private static final double LIMITE_ENVIO_CONCESION = 500.0;

    private static final double COSTO_ESTANDAR = 100.0;
    private static final double COSTO_CONCESION = 50.0;
    private static final double COSTO_GRATIS = 0.0;

    public static double calcularCostoEnvio(double importePedido, boolean esPremium) {
        if (esPremium || importePedido >= LIMITE_ENVIO_GRATIS) {
            return COSTO_GRATIS;
        }
        if (importePedido >= LIMITE_ENVIO_CONCESION) {
            return COSTO_CONCESION;
        }
        return COSTO_ESTANDAR;
    }
}