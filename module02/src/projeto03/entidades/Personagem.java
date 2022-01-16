package projeto03.entidades;

public class Personagem {
    private String nome;
    private Genero sexo;
    private int vida, ataque, defesa;
    //motivacao 1=Vingança - 2=Glória
    private int motivacao;

    public Personagem(String nome, Genero sexo, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.sexo = sexo;
        this.vida = vida;
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

    public int getMotivacao() {
        return motivacao;
    }

    public void setMotivacao(int motivacao) {
        this.motivacao = motivacao;
    }

    public void getMensagemMorte() {
        if (this.motivacao == 1) System.out.println("Não foi possível concluir sua vingança, agora resta saber se alguém se vingará por você.\n");
        if (this.motivacao == 2) System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu(sua) próximo(a) herói(na).\n");
    }

    public void sofrerDano(int dano) {
        this.vida = this.getVida() - dano;
    }

    public int ataque(Personagem atacante, Personagem defensor, int dado, int danoArma) {
        int danoRandom = (int) Math.floor(Math.random()*dado+1);
        System.out.printf("\n%s rolou o dado D%d e tirou %d.\n", atacante.getNome(), dado, danoRandom);
        //Se dado = 1, erra o alvo.
        if (danoRandom == 1) {
            System.out.printf("\n%s rolou o dado D%d, tirou %d e errou o ataque.\n", atacante.getNome(), dado, danoRandom);
            return 0;
        }
        //Se dado = 20, ataque crítico, ignora defesa.
        if (danoRandom == 20) {
            System.out.printf("\n%s rolou o dado D%d, tirou %d e acertou um ataque crítico.\n", atacante.getNome(), dado, danoRandom);
            int danoTotal = danoRandom + atacante.getAtaque() + danoArma;
            defensor.sofrerDano(danoTotal);
            return danoTotal;
        }

        System.out.printf("\n%s rolou o dado D%d, tirou %d e acertou um ataque normal.\n", atacante.getNome(), dado, danoRandom);
        int danoTotal = danoRandom + atacante.getAtaque() + danoArma - defensor.getDefesa();
        defensor.sofrerDano(danoTotal);
        return danoTotal;

    }


}
