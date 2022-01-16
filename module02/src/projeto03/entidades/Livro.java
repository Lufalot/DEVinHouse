package projeto03.entidades;

public class Livro extends Arma {
    public Livro() {
        super(5);
    }

    @Override
    public void infoDano(int dano) {
        System.out.printf("Você atacou com seu livro, absorvendo energia do livro com uma mão e liberando com a outra, e causou %d pontos de dano no inimigo!\n", dano);
    }
}



