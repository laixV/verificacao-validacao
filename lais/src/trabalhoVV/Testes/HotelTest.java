package trabalhoVV.Testes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import trabalhoVV.Hotel;
import trabalhoVV.Quarto;

public class HotelTest {

    @Test
    public void testAdicionarQuarto() {
        Hotel hotel = new Hotel("Teste");
        Quarto quarto = new Quarto(1);
        hotel.adicionarQuarto(quarto);
        assertTrue(hotel.getQuartos().contains(quarto));
    }

    @Test
    public void testRemoverQuarto() {
        Hotel hotel = new Hotel("Teste");
        Quarto quarto = new Quarto(1);
        assertFalse(hotel.getQuartos().contains(quarto));
    }

}
