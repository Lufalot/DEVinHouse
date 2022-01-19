package projeto03.entidades;

import projeto03.AppJogo;

public class Lider extends Personagem {
    public Lider() {
        super("Líder do Mal", Genero.MASCULINO, 50, 20, 20);
    }

    @Override
    public int sofrerDano(int dano) {
        if(AppJogo.nivelDificuldade == 3) dano *= 0.9;
        this.setVida(this.getVida() - dano);
        return dano;
    }
}
