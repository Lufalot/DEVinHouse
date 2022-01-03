package semana03.exercicio09;

public class FuncionarioHorista extends Funcionario{

    private String tipo = "Horista";
    private int salarioBase = 1200;

    @Override
    public int getSalario(int dias) {
        return salarioBase + (dias * 55);
    }

    @Override
    public String toString() {
        return tipo;
    }
}
