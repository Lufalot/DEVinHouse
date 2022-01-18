package projeto03;

import projeto03.entidades.*;

import java.util.Scanner;

public class AppJogo {
    static Scanner keyboard = new Scanner(System.in);
    private static Personagem jogador;
    private static Genero sexo;
    private static String nome;
    private static final Personagem armeiro = new Orc("Armeiro");
    private static final Personagem alquimista = new Orc("Alquimista");
    private static final Personagem lider = new Lider();

    public static void inicio() {
        System.out.println("Seja bem vindo(a) à BATALHA FINAL!");

        System.out.println("Digite seu nome:");
        nome = keyboard.nextLine();

        escholherGenero();
        escolherClasse();
        escolherArma();
    }

    public static void escholherGenero() {
        int opcao;
        try {
            do {
                System.out.println("Escolha o gênero do personagem: 1 - Masculino | 2 - Feminino");

                opcao = keyboard.nextInt();
                switch(opcao) {
                    case 1:
                        sexo = Genero.MASCULINO;
                        break;
                    case 2:
                        sexo = Genero.FEMININO;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escolherClasse() {
        int opcao;
        try{
            do {
                System.out.println("Escolha a classe do personagem:");
                System.out.println("1 - Humano | 2 - Anão | 3 - Elfo | 4 - Mago");
                opcao = keyboard.nextInt();
                switch (opcao) {
                    case 1:
                        jogador = new Humano(nome, sexo);
                        break;
                    case 2:
                        jogador = new Anao(nome, sexo);
                        break;
                    case 3:
                        jogador = new Elfo(nome, sexo);
                        break;
                    case 4:
                        jogador = new Mago(nome, sexo);
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 4);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escolherArma() {
        int opcao;
        try {
            do {
                System.out.println("Escolha sua arma:");
                System.out.println("1 - Espada | 2 - Machado | 3 - Martelo | 4 - Clava | 5 - Arco e Flecha | 6 - Besta e Virote | 7 - Cajado | 8 - Livro");
                opcao = keyboard.nextInt();
                switch (opcao) {
                    case 1:
                        jogador.setArma(new Espada());
                        break;
                    case 2:
                        jogador.setArma(new Machado());
                        break;
                    case 3:
                        jogador.setArma(new Martelo());
                        break;
                    case 4:
                        jogador.setArma(new Clava());
                        break;
                    case 5:
                        jogador.setArma(new ArcoFlecha());
                        break;
                    case 6:
                        jogador.setArma(new BestaVirote());
                        break;
                    case 7:
                        jogador.setArma(new Cajado());
                        break;
                    case 8:
                        jogador.setArma(new Livro());
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 8);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escolherMotivacao() {
        System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo:\n1 - VINGANÇA | 2 - GLÓRIA");

        String vinganca = "Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\n" +
                "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\n" +
                "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\n" +
                "que te ﬁzeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\n" +
                "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\n" +
                "finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).\n";

        String gloria = "Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços\n" +
                "abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e\n" +
                "diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde\n" +
                "já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir\n" +
                "o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa\n" +
                "história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.\n";

        try {
            int opcao;
            do {
                opcao = keyboard.nextInt();
                switch (opcao) {
                    case 1:
                        jogador.setMotivacao(1);
                        System.out.println(vinganca);
                        break;
                    case 2:
                        jogador.setMotivacao(2);
                        System.out.println(gloria);
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void decidirContinuar() {
        String decisao = "Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas\n" +
                "mãos formigarem em volta da sua arma. Você a segura com ﬁrmeza. Seu foco está renovado.\n" +
                "Você avança pelo portal.\n" +
                "\n" +
                "A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua\n" +
                "frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à\n" +
                "frente, ou desistir.\n";
        System.out.println(decisao);

        String continuar = "Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente\n" +
                "uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta\n" +
                "aberta.\n" +
                "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera\n" +
                "sobre como passar pela porta.\n";

        String desistir = "O medo invade o seu coração e você sente que ainda não está à altura do desaﬁo.\n" +
                "Você se volta para a noite lá fora e corre em direção à segurança.\n";

        int opcao;
        try {
            do {
                System.out.println("1 - Seguir em frente | 2 - Desistir.");
                opcao = keyboard.nextInt();
                switch(opcao) {
                    case 1:
                        System.out.println(continuar);
                        break;
                    case 2:
                        System.out.println(desistir);
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 2);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }



    public static void armadilha(int dado) {
        int danoRandom = (int) Math.floor(Math.random()*dado+1);
        int danoTotal = danoRandom - (jogador.getDefesa()/10);
        if (danoTotal <= 0) {
            System.out.println("Você defendeu o ataque disparado pela armadilha.\n");
            return;
        }
        jogador.sofrerDano(danoTotal);
        System.out.printf("Você sofreu %d de dano, e agora possui %d pontos de vida.\n", danoTotal, jogador.getVida());
    }

    public static void decidirEntrar() {

        String andando = "Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você\n" +
                "pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado\n" +
                "em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se\n" +
                "abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta\n" +
                "para dentro da sala, porém uma delas te acerta na perna.\n";

        String correndo = "Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,\n" +
                "sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala,\n" +
                "olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de ﬂechas\n" +
                "batendo na pedra atrás de você, e quando se vira, vê várias ﬂechas no chão. Espiando pela porta,\n" +
                "você entende que pisou em uma armadilha que soltou ﬂechas de uma escotilha aberta no teto,\n" +
                "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.\n";

        String saltando = "Você se concentra e pula em direção à luz, saltando de antes da porta até o interior\n" +
                "da sala.\n";

        int opcao;
        try {
            do {
                System.out.println("1 - Andando cuidadosamente | 2 - Correndo | 3 - Saltando.");
                opcao = keyboard.nextInt();
                switch(opcao) {
                    case 1:
                        System.out.println(andando);
                        //Sofre dano utilizando D10
                        armadilha(10);
                        break;
                    case 2:
                        System.out.println(correndo);
                        break;
                    case 3:
                        System.out.println(saltando);
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 3);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void decidirPegarArmadura() {
        String texto01 = "Após derrotar o Armeiro, você percebe que seus equipamentos estão muito daniﬁcados, e olha\n" +
                "em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.\n";

        System.out.println(texto01);

        String pegar = "Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas,\n" +
                "que estavam daniﬁcadas, pelas peças de armaduras existentes na sala. De armadura nova,\n" +
                "você se sente mais protegido para os desaﬁos à sua frente.\n";

        String naoPegar = "Você decide que não precisa utilizar nada que venha das mãos do inimigo.\n";

        int opcao;
        try {
            do {
                System.out.println("1 - Pegar nova armadura | 2 - Ignorar.");
                opcao = keyboard.nextInt();
                switch(opcao) {
                    case 1:
                        System.out.println(pegar);
                        jogador.incrementarDefesa(5);
                        break;
                    case 2:
                        System.out.println(naoPegar);
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 2);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static void portaDireita() {
        String texto01 = "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não\n" +
                "escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a\n" +
                "outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha\n" +
                "pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal\n" +
                "do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem\n" +
                "para espalhar o terror nas cidades e vilas da região.\n" +
                "\n" +
                "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar\n" +
                "para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um\n" +
                "dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em\n" +
                "posição de combate. Ele avança em sua direção.\n";

        System.out.println(texto01);

        Combate.combateNormal(jogador, armeiro);

        decidirPegarArmadura();

        String texto02 = "Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das\n" +
                "fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva\n" +
                "presa ao cinto.";

        System.out.println(texto02);

    }

    public static void decidirPegarPocao() {
        String texto01 = "Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque\n" +
                "do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido\n" +
                "levemente rosado, pega a garrafa e pondera se deve beber um gole.\n";

        System.out.println(texto01);

        int opcao;
        try {
            do {
                System.out.println("1 - Beber poção | 2 - Ignorar.");
                opcao = keyboard.nextInt();
                switch(opcao) {
                    case 1:
                        System.out.println("Você se sente revigorado para seguir adiante!\n");
                        jogador.regenerar();
                        break;
                    case 2:
                        System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void portaEsquerda() {
        String texto01 = "\nVocê retorna à sala anterior e se dirige à porta da esquerda. Você se\n" +
                "aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais\n" +
                "força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara\n" +
                "com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e\n" +
                "garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão\n" +
                "que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos\n" +
                "soldados para aterrorizar a região.\n" +
                "\n" +
                "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque\n" +
                "horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.\n";

        System.out.println(texto01);

        Combate.combateNormal(jogador, alquimista);

        decidirPegarPocao();

        String texto02 = "Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave\n" +
                "abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa\n" +
                "que leva presa ao cinto.";

        System.out.println(texto02);
    }

    public static void portaCentral() {
        String texto01 = "Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e\n" +
                "prisioneiros acorrentados às paredes.\n" +
                "\n" +
                "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de\n" +
                "lâmina dupla.\n";

        System.out.println(texto01);

        int opcao;
        try {
            do {
                System.out.println("1 - Atacar | 2 - Esperar.");
                opcao = keyboard.nextInt();
                switch(opcao) {
                    case 1:
                        Combate.combateNormal(jogador, lider);
                        break;
                    case 2:
                        Combate.combateSemIniciativa(jogador, lider);
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (opcao < 1 || opcao > 2);
        } catch(Exception e) {
            e.printStackTrace();
        }

        jogador.getMensagemMotivacao();

        System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em\n" +
                "direção à noite, retornando à cidade. Seu dever está cumprido.");
    }

    public static void main(String[] args) {

        inicio();

        String intro = "A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo\n" +
                "você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e\n" +
                "sabe que a partir desse ponto, sua vida mudará para sempre.\n" +
                "Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de\n" +
                "todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu\n" +
                "equipamento de combate, já daniﬁcado e desgastado depois de tantas lutas. Você está a um\n" +
                "passo de encerrar para sempre esse mal.\n" +
                "Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.\n";
        System.out.println(intro);

        escolherMotivacao();
        decidirContinuar();
        decidirEntrar();

        String antesala01 = "\nVocê se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\n" +
                "delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A\n" +
                "porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você\n" +
                "não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima\n" +
                "da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que\n" +
                "precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\n" +
                "enfrentar o líder.\n" +
                "\n" +
                "Você se dirige para a porta à direita.\n";

        System.out.println(antesala01);

        portaDireita();

        portaEsquerda();

        String antesala02 = "De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a\n" +
                "porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você\n" +
                "percebe que está muito próximo do seu objetivo final. Segura sua arma com mais ﬁrmeza, foca\n" +
                "no combate que você sabe que irá se seguir, e adentra a porta.\n";

        System.out.println(antesala02);

        portaCentral();

    }
}
