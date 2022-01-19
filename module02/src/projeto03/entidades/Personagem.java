package projeto03.entidades;

public abstract class Personagem {
    private String nome;
    private Genero sexo;
    private int vida, ataque, defesa;
    private final int vidaTotal;
    private Arma arma;

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

    public void setMotivacao(int motivacao) {}

    public void getMensagemMotivacao() {}

    public void getMensagemMorte() {}

    public int sofrerDano(int dano) {
        this.vida = this.getVida() - dano;
        return dano;
    }
}
