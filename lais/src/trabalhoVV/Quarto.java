package trabalhoVV;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private boolean disponivel;
    private List<Reserva> reservas;

    public Quarto(int numero) {
        this.numero = numero;
        this.disponivel = true;
        this.reservas = new ArrayList<>();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        disponivel = false;
    }

    // Getters e Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }


    @Override
    public String toString() {
        return "Quarto " + numero + " - Disponível: " + disponivel;
    }
}
