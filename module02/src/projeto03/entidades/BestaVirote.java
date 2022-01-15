package projeto03.entidades;

public class BestaVirote extends Arma {
    public BestaVirote() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com sua besta, o virote atingiu e causou %d de dano no inimigo!\n", dano);
    }
}
