package projeto03.entidades;

public class Personagem {
    private String nome;
    private Genero sexo;
    private int vida, ataque, defesa;
    private final int vidaTotal;
    private Arma arma;
    //motivacao 1=Vingança - 2=Glória
    private int motivacao;

    public Personagem(String nome, Genero sexo, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.sexo = sexo;
        this.vida = vida;
        this.vidaTotal = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(Genero sexo) {
        this.sexo = sexo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void regenerar() { this.vida = vidaTotal; }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void incrementarDefesa(int acrescimo) {
        this.setDefesa(this.getDefesa() + acrescimo);
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setMotivacao(int motivacao) {
        this.motivacao = motivacao;
    }

    public void getMensagemMotivacao() {
            if (this.motivacao == 1) System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma\n" +
                    "sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você\n" +
                    "pode seguir sua vida.\n");
            if (this.motivacao == 2) System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de\n" +
                    "alegria. A glória o aguarda, você a conquistou.\n");
    }

    public void getMensagemMorte() {
        if (this.motivacao == 1) System.out.println("Não foi possível concluir sua vingança, agora resta saber se alguém se vingará por você.\n");
        if (this.motivacao == 2) System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).\n");
    }

    public void sofrerDano(int dano) {
        this.vida = this.getVida() - dano;
    }



}
