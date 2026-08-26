import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorEnvioTest {

    @Test
    void testCalcularCostoEnvio() {
        assertEquals(100.0, CalculadorEnvio.calcularCostoEnvio(400.0));
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(700.0));
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(1200.0));

        assertEquals(100.0, CalculadorEnvio.calcularCostoEnvio(499.99));
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(500.00));
        assertEquals(50.0, CalculadorEnvio.calcularCostoEnvio(999.99));
        assertEquals(0.0, CalculadorEnvio.calcularCostoEnvio(1000.00));
    }
}