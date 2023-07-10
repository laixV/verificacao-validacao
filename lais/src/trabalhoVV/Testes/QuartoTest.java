package trabalhoVV.Testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import trabalhoVV.*;

public class QuartoTest {

    @Test
    public void testGetNumero() {
        Quarto quarto = new Quarto(1);
        assertEquals(1, quarto.getNumero());
    }

    @Test
    public void testSetNumero() {
        Quarto quarto = new Quarto(1);
        quarto.setNumero(2);
        assertEquals(2, quarto.getNumero());
    }

}
