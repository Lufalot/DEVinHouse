package projeto03.entidades;

public class Arma {
    private int ataque;

    public Arma(int ataque) {
        this.ataque = ataque;
    }

    public void infoDano(int dano) {
        System.out.printf("Você atacou com sua arma e causou %d de dano no inimigo!\n", dano);
    }
}
