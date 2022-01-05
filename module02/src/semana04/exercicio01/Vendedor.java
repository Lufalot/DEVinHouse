package semana04.exercicio01;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, String matricula, double salario_base, double comissao) {
        super(nome, matricula, salario_base+comissao);
    }

    @Override
    public double calculaSalario() {
        return this.getSalario_base();
    }
}
