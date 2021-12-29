package semana03.exercicio08;

public class Placar {
    TimeCasa timeCasa = new TimeCasa();
    TimeVisitante timeVisitante = new TimeVisitante();

    public void reset() {
        timeCasa.reset();
        timeVisitante.reset();
    }

    @Override
    public String toString() {
        return String.format("Time da casa %d X %d Time Visitante",timeCasa.getPontos(),timeVisitante.getPontos());
    }
}
