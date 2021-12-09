package semana03.exercicio01;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Lucas");
        pessoa01.setIdade(36);

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());
        pessoa01.fazAniversario();
        System.out.println(pessoa01.getIdade());

    }
}
