package projeto03.entidades;

public class Clava extends Arma {
    public Clava() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com sua clava e causou %d pontos de dano no inimigo!\n", dano);
    }
}