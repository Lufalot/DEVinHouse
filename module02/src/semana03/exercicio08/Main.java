package semana03.exercicio08;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
        public static void main(String[] args) {
            Placar placar = new Placar();

            String menu = "" +
                        "|-------------------------------|\n" +
                        "|Bem-vindos ao placar da rodada |\n" +
                        "|-------------------------------|\n" +
                        "|  1: Iniciar novo jogo     	|\n" +
                        "|  2: Saber o placar atual  	|\n" +
                        "|  3: + Ponto time da casa  	|\n" +
                        "|  4: - Ponto time da casa  	|\n" +
                        "|  5: + Ponto time visitante	|\n" +
                        "|  6: - Ponto time visitante	|\n" +
                        "|  0: Sair                  	|\n" +
                        "|-------------------------------|\n";

            int opcao;

            do {
                System.out.println(menu);
                opcao = keyboard.nextInt();

                switch(opcao) {
                    case 1:
                        placar.reset();
                        break;
                    case 2:
                        System.out.println(placar);
                        break;
                    case 3:
                        placar.timeCasa.pontosIncrease();
                        break;
                    case 4:
                        placar.timeCasa.pontosDecrease();
                        break;
                    case 5:
                        placar.timeVisitante.pontosIncrease();
                        break;
                    case 6:
                        placar.timeVisitante.pontosDecrease();
                        break;
                    case 0:
                        break;
                }
            } while (opcao != 0);

        }
}
