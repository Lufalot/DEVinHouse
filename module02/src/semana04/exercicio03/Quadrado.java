package semana04.exercicio03;

public class Quadrado implements FiguraGeometrica {
    private final float lado;
    public Quadrado(float lado) {
            this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";

    }

    @Override
    public float getArea() {
        return this.lado * this.lado;
    }
}
