
import com.uema.funcionario.Inss;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Inss
 *
 * @author Lucas S. Vieira
 */
public class TestINSS {
    Inss irrfInstance = new Inss();

    @Test
    /**
     * Se espera o valor de desconto do IR
     * Testando diversas faixas de rendimentos
     **/
    public void testCalcularInss() {
        assertEquals(1045 * 0.075, irrfInstance.calcularINSS(1045));
        assertEquals(1600 * 0.090, irrfInstance.calcularINSS(1600));
        assertEquals(2500 * 0.120, irrfInstance.calcularINSS(2500));
        assertEquals(3500 * 0.14, irrfInstance.calcularINSS(3500));
    }
}
