package projeto03.entidades;

public class Martelo extends Arma {
    public Martelo() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com seu martelo e causou %d pontos de dano no inimigo!\n", dano);
    }
}
