package projeto03.entidades;

import projeto03.AppJogo;

public class Jogador extends Personagem {

    //motivacao 1=Vingança - 2=Glória
    private int motivacao;

    public Jogador(String nome, Genero sexo, int vida, int ataque, int defesa) {
        super(nome, sexo, vida, ataque, defesa);
    }

    @Override
    public void setMotivacao(int motivacao) {
        this.motivacao = motivacao;
    }


   @Override
    public void getMensagemMotivacao() {
            if (this.motivacao == 1) System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\n" +
                    "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\n" +
                    "pode seguir sua vida.\n");
            if (this.motivacao == 2) System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\n" +
                    "alegria. A glória o aguarda, você a conquistou.\n");
    }

    @Override
    public void getMensagemMorte() {
        if (this.motivacao == 1) System.out.println("Não foi possível concluir sua vingança, agora resta saber se alguém se vingará por você.\n");
        if (this.motivacao == 2) System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).\n");
    }

    @Override
    public int sofrerDano(int dano) {
        if(AppJogo.nivelDificuldade == 1) dano *= 0.8;
        this.setVida(this.getVida() - dano);
        return dano;
    }



}
