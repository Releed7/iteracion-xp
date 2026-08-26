import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorEnvioTest {

    @Test
    void testCalcularCostoEnvioEstandar() {
        assertEquals(100.0, CalculadorEnvio.calcularCostoEnvio(400.0, false));
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(700.0, false));
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(1200.0, false));

        assertEquals(100.0, CalculadorEnvio.calcularCostoEnvio(499.99, false));
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(500.00, false));
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(999.99, false));
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(1000.00, false));
    }

    @Test
    void testCalcularCostoEnvioPremium() {
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(100.0, true));
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(499.99, true));
    }
}