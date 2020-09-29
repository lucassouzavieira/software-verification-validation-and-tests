
import org.junit.jupiter.api.Test;
import com.uema.funcionario.Salario;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test TestSalario
 *
 * @author Lucas S. Vieira
 */
public class TestSalario {
    Salario salarioInstance = new Salario();

    @Test
    public void testCalcularDesconto() {
        salarioInstance.setAdiantamento(0);
        salarioInstance.setSalario(1045);

        double expected = (1045 * 0.075) + (0); // INSS + IRRF
        assertEquals(expected, salarioInstance.calcularDesconto());

        salarioInstance.setSalario(2000);
        expected = (2000 * 0.09) + (2000 * 0.075); // INSS + IRRF
        assertEquals(expected, salarioInstance.calcularDesconto());

        salarioInstance.setSalario(3500);
        expected = (3500 * 0.14) + (3500 * 0.15); // INSS + IRRF
        assertEquals(expected, salarioInstance.calcularDesconto());

        salarioInstance.setSalario(5000);
        expected = (5000 * 0.14) + (5000 * 0.275); // INSS + IRRF
        assertEquals(expected, salarioInstance.calcularDesconto());
    }
}
