package semana04.exercicio03;

public class Retangulo implements FiguraGeometrica {
    private final float base;
    private final float altura;
    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNomeFigura() {
        return "Retangulo";

    }

    @Override
    public float getArea() {
        return this.base * this.altura;
    }
}