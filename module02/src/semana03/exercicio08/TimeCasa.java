package semana03.exercicio08;

public class TimeCasa {
    private int pontos;

    public int getPontos() {
        return pontos;
    }

    public void pontosIncrease() {
        this.pontos += 1;
    }

    public void pontosDecrease() {
        this.pontos -= 1;
    }

    public void reset() {
        this.pontos = 0;
    }
}
