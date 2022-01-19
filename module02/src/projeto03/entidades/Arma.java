package projeto03.entidades;

public abstract class Arma {
    private int ataque;

    public Arma(int ataque) {
        this.ataque = ataque;
    }

    public void infoDano(int dano) {
        System.out.printf("Você atacou com sua arma e causou %d pontos de dano no inimigo!\n", dano);
    }

    public int getAtaque() {
        return ataque;
    }
}
