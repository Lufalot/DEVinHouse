package projeto03.entidades;

import java.util.Scanner;

public class Combate {
    static Scanner keyboard = new Scanner(System.in);

    public static int ataque(Personagem atacante, Personagem defensor, int dado, int danoAtacante) { //boolean turnoInimigo
        int danoRandom = (int) Math.floor(Math.random()*dado+1);
        int danoPrimario = danoRandom + danoAtacante;
        int danoTotal = danoPrimario - defensor.getDefesa();

        //ataque normal
        if (danoRandom > 1 && danoRandom < 20) {
            System.out.printf("\n%s rolou o dado D%d, tirou %d e acertou um ataque normal.\n", atacante.getNome(), dado, danoRandom);
            if (danoPrimario <= defensor.getDefesa()) {
                System.out.printf("%s defendeu o ataque.\n", defensor.getNome());
                danoTotal = 0;
            }
            return defensor.sofrerDano(danoTotal);
        }

        //Se dado = 1, erra o alvo.
        if (danoRandom == 1) {
            System.out.printf("\n%s rolou o dado D%d, tirou %d e errou o ataque.\n", atacante.getNome(), dado, danoRandom);
            return 0;
        }
        //Se dado = 20, ataque crítico, ignora defesa.
        if (danoRandom == 20) {
            System.out.printf("\n%s rolou o dado D%d, tirou %d e acertou um ataque crítico.\n", atacante.getNome(), dado, danoRandom);
            return defensor.sofrerDano(danoPrimario);
        }

        return danoTotal;

    }

    public static void combateTurnoJogador(Personagem jogador, Personagem inimigo) {
        //Turno jogador
        System.out.println("1 - Atacar | 2 - Fugir");
        int opcao = keyboard.nextInt();
        if (opcao == 2) {
            System.out.println("Você não estava preparado para a força do inimigo,\n" +
                    "e decide fugir para que possa tentar novamente em uma próxima vez.”.\n");
            System.exit(0);
        }
        int danoTurnoJogador = ataque(jogador, inimigo, 20, jogador.getArma().getAtaque() + jogador.getAtaque());
        if (danoTurnoJogador > 0) jogador.getArma().infoDano(danoTurnoJogador);

        //Se inimigo morre, acaba o combate
        if (inimigo.getVida() < 1) {
            System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.\n");
        }
    }

    public static void combateTurnoInimigo(Personagem jogador, Personagem inimigo) {
        //Turno inimigo
        int danoTurnoInimigo = ataque(inimigo, jogador, 20, inimigo.getAtaque());

        if (danoTurnoInimigo > 0) {
            if (jogador.getVida() < 1) {
                System.out.printf("O inimigo atacou! Você sofreu %d de dano e morreu.\n", danoTurnoInimigo);
                jogador.getMensagemMorte();
                System.exit(0);
            }
            System.out.printf("O inimigo atacou! Você sofreu %d de dano e agora possui %d pontos de vida.\n", danoTurnoInimigo, jogador.getVida());
        }
    }


    public static void combateNormal(Personagem jogador, Personagem inimigo) {
        do {
            combateTurnoJogador(jogador, inimigo);
            //Se inimigo morre, acaba o combate
            if (inimigo.getVida() < 1) { return; }
            combateTurnoInimigo(jogador, inimigo);

        } while (jogador.getVida() > 0 && inimigo.getVida() > 0);

    }

    public static void combateSemIniciativa(Personagem jogador, Personagem inimigo) {
        do {
            combateTurnoInimigo(jogador, inimigo);
            //Se jogador morre, acaba o combate
            if (jogador.getVida() < 1) { return;}
            combateTurnoJogador(jogador, inimigo);

        } while (jogador.getVida() > 0 && inimigo.getVida() > 0);
    }
}
