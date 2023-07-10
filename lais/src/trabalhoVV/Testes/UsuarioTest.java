package trabalhoVV.Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import trabalhoVV.Usuario;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("João");
        assertEquals("João", usuario.getNome());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario("João");
        usuario.setNome("Maria");
        assertEquals("Maria", usuario.getNome());
    }

}
