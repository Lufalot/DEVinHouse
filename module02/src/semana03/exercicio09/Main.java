package semana03.exercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    static List<Funcionario> funcionarios = new ArrayList<>();

    public static int getSalarios(int dias) {
        return funcionarios.stream().mapToInt(funcionario -> funcionario.getSalario(dias)).sum();
    }

    public static void main(String[] args) {



        String menu = "\n" +
                "|-------------------------------|\n" +
                "| Sistema de Folha de Pagamento |\n" +
                "|-------------------------------|\n" +
                "|1: Ver funcionários          	|\n" +
                "|2: Novo funcionário           	|\n" +
                "|3: Novo funcionário Horista    |\n" +
                "|4: Novo funcionário Concursado |\n" +
                "|5: Ver folha de pgto (10 dias) |\n" +
                "|6: Ver folha de pgto (21 dias) |\n" +
                "|0: Sair                       	|\n" +
                "|-------------------------------|\n";

        int opcao;

        do {
            System.out.println(menu);
            opcao = keyboard.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println(funcionarios);
                    break;
                case 2:
                    Funcionario novoFuncionario = new Funcionario();
                    funcionarios.add(novoFuncionario);
                    break;
                case 3:
                    Funcionario novoFuncionarioHorista = new FuncionarioHorista();
                    funcionarios.add(novoFuncionarioHorista);
                    break;
                case 4:
                    Funcionario novoFuncionarioConcursado = new FuncionarioConcursado();
                    funcionarios.add(novoFuncionarioConcursado);
                    break;
                case 5:
                    System.out.println("Salários (10 dias):");
                    int total10 = getSalarios(10);
                    System.out.printf("Total: R$ %d.00", total10);
                    break;
                case 6:
                    System.out.println("Salários (21 dias):");
                    int total21 = getSalarios(21);
                    System.out.printf("Total: R$ %d.00", total21);
                    break;
                case 0:
                    break;
            }
        } while (opcao != 0);

    }
}
