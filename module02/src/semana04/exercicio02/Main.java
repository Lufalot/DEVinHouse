package semana04.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<>();

        CartaoWeb diaDosNamorados = new DiaDosNamorados("Fátima");
        cartoes.add(diaDosNamorados);

        CartaoWeb natal = new Natal("Luís");
        cartoes.add(natal);

        CartaoWeb aniversario = new Aniversario("Carlos");
        cartoes.add(aniversario);

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }

    }
}
