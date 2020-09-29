
import org.junit.jupiter.api.Test;
import com.uema.funcionario.Irrf;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test IRRF
 *
 * @author Lucas S. Vieira
 */
public class TestIRRF {
    Irrf irrfInstance = new Irrf();

    @Test
    /**
     * Se espera o valor de desconto do IR
     * Testando diversas faixas de rendimentos
     **/
    public void testExibir() {
        assertEquals(0, irrfInstance.calcularIRRF(1650));
        assertEquals(2000 * 0.075, irrfInstance.calcularIRRF(2000));
        assertEquals(3500 * 0.15, irrfInstance.calcularIRRF(3500));
        assertEquals(4000 * 0.225, irrfInstance.calcularIRRF(4000));
        assertEquals(5000 * 0.275, irrfInstance.calcularIRRF(5000));
    }
}
