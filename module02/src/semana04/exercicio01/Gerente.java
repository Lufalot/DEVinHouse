package semana04.exercicio01;

public class Gerente extends Funcionario {

    public Gerente(String nome, String matricula, double salario_base) {
        super(nome, matricula, salario_base*2);
    }

    @Override
    public double calculaSalario() {
        return this.getSalario_base();
    }
}
