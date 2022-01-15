package projeto03.entidades;

public class ArcoFlecha extends Arma {
    public ArcoFlecha() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com seu arco, a flecha atingiu e causou %d de dano no inimigo!\n", dano);
    }
}

