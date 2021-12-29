package semana03.estacionamento.main;

import semana03.estacionamento.entidades.Estacionamento;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        String menu = "";
        menu += "Entre com a opção desejada: \n";
        menu += " 1 - Entrada de veículo \n";
        menu += " 2 - Saída de veículo \n";
        menu += " 3 - Faturamento por moto \n";
        menu += " 4 - Faturamento por utilitário \n";
        menu += " 5 - Faturamento por carro \n";
        menu += " 6 - Faturamento \n";
        menu += " 7 - Sair \n";

        System.out.println("Digite o valor da hora para iniciar o estacionemnto: ");
        double valorHora = entrada.nextDouble();

        Estacionamento estacionamento = new Estacionamento(valorHora);

        do {
            System.out.println(menu);
            opcao = entrada.nextInt();

            switch(opcao) {
                case 1:
                    darEntrada(estacionamento);
                    break;
                case 2:
                    System.out.printf("O valor a ser pago é: %.2f%n\n",darSaida(estacionamento));
                    break;
                case 3:
                    System.out.printf("Faturameto total por moto: %.2f%n\n",
                            estacionamento.getTotalFaturamentoMoto());
                    break;
                case 4:
                    System.out.printf("Faturameto total por utilitário: %.2f%n\n",
                            estacionamento.getTotalFaturamentoUtilitario());
                    break;
                case 5:
                    System.out.printf("Faturameto total por carro: %.2f%n\n",
                            estacionamento.getTotalFaturamentoCarro());
                    break;
                case 6:
                    System.out.printf("Faturameto total: %.2f%n\n",
                            estacionamento.getTotalFaturamento());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 7);
    }

    public static void darEntrada(Estacionamento estacionamento) {
        entrada.nextLine();
        System.out.println("Digite a placa do veiculo:");
        String placa = entrada.nextLine();
        System.out.println("Digite o tipo do veículo:");
        String tipoVeiculo = entrada.nextLine();
        System.out.println("Digite a hora de entrada:");
        int hora = entrada.nextInt();
        System.out.println("Digite o minuto de entrada:");
        int minuto = entrada.nextInt();

        estacionamento.darEntrada(placa, tipoVeiculo, LocalTime.of(hora, minuto));
    }

    public static double darSaida(Estacionamento estacionamento) {
        entrada.nextLine();
        System.out.println("Digite a placa do veiculo:");
        String placa = entrada.nextLine();
        System.out.println("Digite a hora de saída:");
        int hora = entrada.nextInt();
        System.out.println("Digite o minuto de saída:");
        int minuto = entrada.nextInt();

        return estacionamento.darSaida(placa, LocalTime.of(hora, minuto));
    }

}
