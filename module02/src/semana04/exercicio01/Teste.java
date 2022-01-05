package semana04.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Lucas", "001", 15000);
        Funcionario assistente = new Assistente("Fábio", "002", 3500);
        Funcionario vendedor = new Vendedor("Antônio", "003", 4000, 2500);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(gerente);
        funcionarios.add(assistente);
        funcionarios.add(vendedor);

        funcionarios.forEach(item -> {
            System.out.println(item.calculaSalario());
        });

        System.out.println(gerente.calculaSalario()+assistente.calculaSalario()+vendedor.calculaSalario());
    }

}
