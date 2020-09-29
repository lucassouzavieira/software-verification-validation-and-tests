
import org.junit.jupiter.api.Test;
import com.uema.funcionario.FuncADM;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFuncADM {
    FuncADM funInstance = new FuncADM();

    @Test
    public void testExibir() {
        String funcionario = "Nome: Lucas Vieira" +
                "\nFuncao: Desenvolvedor" +
                "\nSetor: TI";

        String expected = "Dados do Funcionario ADM\n" + funcionario +
                "\nrecebe R$2560.55" +
                "\nDesconto total 156.45";

        assertEquals(expected, funInstance.exibir());
    }
}
