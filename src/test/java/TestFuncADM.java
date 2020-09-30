
import org.junit.jupiter.api.Test;
import com.uema.funcionario.Salario;
import com.uema.funcionario.FuncADM;
import com.uema.funcionario.Fucionario;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test FuncADM
 *
 * @author Lucas S. Vieira
 */
public class TestFuncADM {

    @Test
    public void testExibir() {
        Fucionario funcionario = new Fucionario();
        funcionario.setNome("Lucas Vieira");
        funcionario.setSetor("TI");
        funcionario.setFuncao("Desenvolvedor");

        Salario salario = new Salario(2560.55);

        FuncADM funInstance = new FuncADM(funcionario, salario);

        String funcionarioText = "Nome: Lucas Vieira" +
                "\nFuncao: Desenvolvedor" +
                "\nSetor: TI";

        assertEquals(funcionarioText, funInstance.getFuncionario().exibir());
        double discount = (2560.55 * 0.12) + (2560.55 * 0.075);
        double value = 2560.55 - discount;

        String expected = "Dados do Funcionario ADM\n" + funcionarioText +
                "\nrecebe R$" + String.format("%.2f do salario", value) +
                "\nDesconto total " + String.format("%.2f do salario", discount);
        assertEquals(expected, funInstance.exibir());
    }
}
