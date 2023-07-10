package trabalhoVV.Testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import trabalhoVV.*;

public class HotelSystemTest {

    @Test
    public void testMenu() {
        String input = "1\n1\n2\n1\n01/07/2023\n05/07/2023\nJoão\n0\n";

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        Main.main(new String[] {});

        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Quarto adicionado com sucesso!"));
        Assertions.assertTrue(output.contains("Reserva realizada com sucesso!"));
        Assertions.assertTrue(output.contains("Encerrando sistema..."));

    }
}
