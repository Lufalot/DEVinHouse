package projeto03.entidades;

public class Cajado extends Arma {
    public Cajado() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com seu cajado, lançando uma bola de fogo e causou %d de dano no inimigo!\n", dano);
    }
}
