package trabalhoVV;

import java.util.Scanner;

public class Main {
    private static Hotel hotel;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        hotel = new Hotel("Hotel Lais");

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarQuarto();
                    break;
                case 2:
                    adicionarReserva();
                    break;
                case 3:
                    adicionarUsuario();
                    break;
                case 4:
                    exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("--- MENU ---");
        System.out.println("1. Adicionar Quarto");
        System.out.println("2. Fazer Reserva");
        System.out.println("3. Adicionar Usuário");
        System.out.println("4. Exibir Informações do Hotel");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarQuarto() {
        System.out.print("Número do quarto: ");
        int numero = scanner.nextInt();

        Quarto quarto = new Quarto(numero);
        hotel.adicionarQuarto(quarto);

        System.out.println("Quarto adicionado com sucesso!");

    }

    private static void adicionarReserva() {

        System.out.print("Número do quarto: ");
        int numeroQuarto = scanner.nextInt();

        System.out.print("Data de entrada (dd/mm/aaaa): ");
        String dataEntrada = scanner.next();

        System.out.print("Data de saída (dd/mm/aaaa): ");
        String dataSaida = scanner.next();

        System.out.print("Nome do hóspede: ");
        String nomeHospede = scanner.next();

        Reserva reserva = new Reserva(numeroQuarto, dataEntrada, dataSaida, nomeHospede);
        boolean sucesso = hotel.fazerReserva(numeroQuarto, reserva);

        if (sucesso) {
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Não foi possível fazer a reserva. Quarto indisponível.");
        }

    }

    private static void adicionarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do usuário: ");
        String nome = scanner.next();

        System.out.print("CPF do usuário: ");
        String cpf = scanner.next();

        Usuario usuario = new Usuario(nome);
        hotel.adicionarUsuario(usuario);

        System.out.println("Usuário adicionado com sucesso!");

    }

    private static void exibirInformacoes() {
        System.out.println("Informações do Hotel:");
        System.out.println(hotel.toString());

    }
}
