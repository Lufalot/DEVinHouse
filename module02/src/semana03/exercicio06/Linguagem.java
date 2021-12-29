package semana03.exercicio06;

import java.io.PrintStream;

public class Linguagem {
    private String linguagem;
    private float version;

    public String getLinguagem() {
        return this.linguagem;
    }

    public float getVersion() {
        return this.version;
    }

    public Linguagem(String linguagem, float version ) {
        this.linguagem = linguagem;
        this.version = version;
    }

    public Linguagem(String linguagem) {
        this.linguagem = linguagem;
        this.version = 1.00F;
    }

    public Linguagem(float version) {
        this.linguagem = "Java";
        this.version = version;
    }

    public Linguagem() {
        this.linguagem = "Java";
        this.version = 1.00F;
    }

    @Override
    public String toString() {
        return String.format("Linguagem: %s - Versão: %.2f",this.getLinguagem(),this.getVersion());
    }

}
