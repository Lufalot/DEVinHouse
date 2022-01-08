package semana04.exercicio03;

public class Triangulo implements FiguraGeometrica {
    private final float base;
    private final float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }

    @Override
    public float getArea() {
        return this.base * this.altura / 2;
    }
}
