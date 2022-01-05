package semana03.exercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    static List<Mamifero> mamiferos = new ArrayList<>();

    public static void listarCatalogo() {
        for (int index = 0; index < mamiferos.size(); index++) {
            System.out.printf("[%d] - Eu sou um %s!\n",index+1,mamiferos.get(index).toString());
        }
    }

    public static void main(String[] args) {

        String menu = "\n" +
                "|-------------------------------|\n" +
                "|     Catálogo de Mamíferos     |\n" +
                "|-------------------------------|\n" +
                "|  1: Listar catálogo         	|\n" +
                "|  2: Contabilizar catálogo   	|\n" +
                "|  3: Adicionar Cachorro        |\n" +
                "|  4: Adicionar Gato            |\n" +
                "|  5: Adicionar Morcego         |\n" +
                "|  0: Sair                   	|\n" +
                "|-------------------------------|\n";

        int opcao;
        int cachorros = 0, gatos = 0, morcegos = 0;

        do {
            System.out.println(menu);
            opcao = keyboard.nextInt();

            switch(opcao) {
                case 1:
                    listarCatalogo();
                    break;
                case 2:
                    System.out.println("O catálogo possui:");
                    System.out.println("   " + cachorros + " Cachorros");
                    System.out.println("   " + gatos + " Gatos");
                    System.out.println("   " + morcegos + " Morcegos");
                    break;
                case 3:
                    Mamifero novoCachorro = new Cachorro();
                    mamiferos.add(novoCachorro);
                    cachorros += 1;
                    break;
                case 4:
                    Mamifero novoGato = new Gato();
                    mamiferos.add(novoGato);
                    gatos += 1;
                    break;
                case 5:
                    Mamifero novoMorcego = new Morcego();
                    mamiferos.add(novoMorcego);
                    morcegos += 1;
                    break;
                case 0:
                    System.out.println("Até a próxima...");
                    break;
            }
        } while (opcao != 0);

    }
}
