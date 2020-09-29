
import org.junit.jupiter.api.Test;
import com.uema.funcionario.Fucionario;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFuncionario {
    Fucionario funInstance = new Fucionario();

    @Test
    public void testExibir() {
        funInstance.setFuncao("Desenvolvedor");
        funInstance.setNome("Lucas Vieira");
        funInstance.setSetor("TI");

        String expected = "Nome: Lucas Vieira" +
                "\nFuncao: Desenvolvedor" +
                "\nSetor: TI";

        assertEquals(expected, funInstance.exibir());
    }
}
