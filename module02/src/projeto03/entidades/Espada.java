package projeto03.entidades;

public class Espada extends Arma {
    public Espada() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com sua espada e causou %d de dano no inimigo!\n", dano);
    }
}
