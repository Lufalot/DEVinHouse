package projeto03.entidades;

public class Machado extends Arma {
    public Machado() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com seu machado e causou %d de dano no inimigo!\n", dano);
    }
}
