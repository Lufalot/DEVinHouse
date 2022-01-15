package projeto03;

import projeto03.entidades.*;

import java.util.Scanner;

public class AppJogo {
    static Scanner keyboard = new Scanner(System.in);
    public static Personagem jogador;
    public static Arma arma;
    public static Genero sexo = null;
    public static String nome;

    public static void inicio() {
        System.out.println("Seja bem vindo(a) à BATALHA FINAL!");

        System.out.println("Digite seu nome:");
        nome = keyboard.nextLine();

        escholherGenero();
        escolherClasse();
        escolherArma();
    }

    public static void escholherGenero() {
        String sexoChar;
        try {
            do {
                System.out.println("Escolha o gênero do personagem (M ou F):");

                sexoChar = keyboard.nextLine();
                switch(sexoChar) {
                    case "M":
                        sexo = Genero.MASCULINO;
                        break;
                    case "F":
                        sexo = Genero.FEMININO;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } while (!sexoChar.equals("M") && !sexoChar.equals("F"));
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
                        arma = new Espada();
                        break;
                    case 2:
                        arma = new Machado();
                        break;
                    case 3:
                        arma = new Martelo();
                        break;
                    case 4:
                        arma = new Clava();
                        break;
                    case 5:
                        arma = new ArcoFlecha();
                        break;
                    case 6:
                        arma = new BestaVirote();
                        break;
                    case 7:
                        arma = new Cajado();
                        break;
                    case 8:
                        arma = new Livro();
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
        System.out.println("Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: 1 - VINGANÇA | 2 - GLÓRIA");

        String vinganca = "Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar\n" +
                "para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,\n" +
                "quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível\n" +
                "que te ﬁzeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles\n" +
                "que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder\n" +
                "ﬁnalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).\n";

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
                        //toma dano utilizando mecanismo de
                        //ataque descrito abaixo, porém o rolamento de dados é só de 1-10
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
        //combate



    }

    public static void main(String[] args) {

        inicio();
        jogador.setDefesa(jogador.getDefesa() + 10);
        System.out.println(jogador.getDefesa());
        arma.infoDano(10);
        System.out.println(sexo);
        System.out.println(jogador.getNome());

        String intro = "A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo\n" +
                "você está prestes a entrar na fase ﬁnal da sua missão. Você olha para o portal à sua frente, e\n" +
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

        String antesala = "Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma\n" +
                "delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A\n" +
                "porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você\n" +
                "não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima\n" +
                "da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que\n" +
                "precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir\n" +
                "enfrentar o líder.\n" +
                "\n" +
                "Você se dirige para a porta à direita.\n";

        System.out.println(antesala);

        portaDireita();


    }
}
