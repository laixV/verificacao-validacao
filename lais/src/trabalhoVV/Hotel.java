package trabalhoVV;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private List<Quarto> quartos;
    private List<Usuario> usuarios;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public boolean fazerReserva(int numeroQuarto, Reserva reserva) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                if (quarto.isDisponivel()) {
                    quarto.adicionarReserva(reserva);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hotel: ").append(nome).append("\n");
        builder.append("Quartos: \n");
        for (Quarto quarto : quartos) {
            builder.append(quarto.toString()).append("\n");
        }
        builder.append("Usuários: \n");
        for (Usuario usuario : usuarios) {
            builder.append(usuario.toString()).append("\n");
        }
        return builder.toString();
    }
}
