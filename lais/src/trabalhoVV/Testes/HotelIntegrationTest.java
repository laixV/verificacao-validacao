package trabalhoVV.Testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import trabalhoVV.*;

public class HotelIntegrationTest {

    @Test
    public void testAdicionarQuartoEUsuario() {
        Hotel hotel = new Hotel("Teste");
        Quarto quarto = new Quarto(1);
        Usuario usuario = new Usuario("João");
        
        hotel.adicionarQuarto(quarto);
        hotel.adicionarUsuario(usuario);
        
        assertTrue(hotel.getQuartos().contains(quarto));
        assertTrue(hotel.getUsuarios().contains(usuario));
    }

    @Test
    public void testFazerReserva() {
        Hotel hotel = new Hotel("Teste");
        Quarto quarto = new Quarto(1);
        Usuario usuario = new Usuario("João");
        
        hotel.adicionarQuarto(quarto);
        hotel.adicionarUsuario(usuario);
        
        Reserva reserva = new Reserva(1, "2023-07-01", "2023-07-05", "Joao");
        assertTrue(hotel.fazerReserva(quarto.getNumero(), reserva));
        
        assertEquals(1, quarto.getReservas().size());
    }


}

