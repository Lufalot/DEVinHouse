package semana03.exercicio05;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        int opcao;
        String menu = "";
        menu += "Entre com a opção desejada: \n";
        menu += " 1 - Cadastrar \n";
        menu += " 2 - Remover \n";
        menu += " 3 - Mostrar index \n";
        menu += " 4 - Mostrar todos \n";
        menu += " 5 - Buscar pelo index \n";
        menu += " 6 - Sair \n";

        do {
            System.out.println(menu);
            opcao = keyboard.nextInt();

            switch(opcao) {
                case 1:
                    cadastrar(agenda);
                    break;
                case 2:
                    remover(agenda);
                    break;
                case 3:
                    mostrarIndex(agenda);
                    break;
                case 4:
                    mostrarTodos(agenda);
                    break;
                case 5:
                    buscarPeloIndex(agenda);
                    break;
                case 6:
                    break;
            }
        } while (opcao != 6);
    }

    public static void cadastrar(Agenda agenda) {
        keyboard.nextLine();
        System.out.println("Digite o nome:");
        String nome = keyboard.nextLine();
        System.out.println("Digite a idade:");
        int idade = keyboard.nextInt();
        System.out.println("Digite a altura:");
        float altura = keyboard.nextFloat();

        agenda.armazenaPessoa(nome, idade, altura);
    }

    public static void remover(Agenda agenda) {
        keyboard.nextLine();
        System.out.println("Digite o nome da pessoa para remover:");
        String nome = keyboard.nextLine();

        agenda.removePessoa(nome);
    }

    public static void mostrarIndex(Agenda agenda) {
        keyboard.nextLine();
        System.out.println("Digite o nome da pessoa para buscar:");
        String nome = keyboard.nextLine();

        int index = agenda.buscaPessoa(nome);
        System.out.println("Posição " + index);
    }

    public static void mostrarTodos(Agenda agenda) {
        agenda.imprimeAgenda();
    }

    public static void buscarPeloIndex(Agenda agenda) {
        keyboard.nextLine();
        System.out.println("Digite o index da pessoa para buscar:");
        int index = keyboard.nextInt();

        agenda.buscaPessoa(index);
    }
}
