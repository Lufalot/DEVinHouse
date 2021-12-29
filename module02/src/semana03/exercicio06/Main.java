package semana03.exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Linguagem> linguagens = new ArrayList<>();
        linguagens.add(new Linguagem());
        linguagens.add(new Linguagem(8.0f));
        linguagens.add(new Linguagem("C#"));
        linguagens.add(new Linguagem("EcmaScript", 6f));
        linguagens.add(new Linguagem("Python", 3.10f));
        linguagens.forEach((lang) -> {
            System.out.println(lang);
        });
    }
}
