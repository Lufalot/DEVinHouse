package projeto03.entidades;

import projeto03.AppJogo;

public class Orc extends Personagem {
    public Orc(String nome) {
        super(nome, Genero.MASCULINO, 30, 15, 15);
    }

    @Override
    public int sofrerDano(int dano) {
        if(AppJogo.nivelDificuldade == 3) dano *= 0.9;
        this.setVida(this.getVida() - dano);
        return dano;
    }
}