package semana03.exercicio09;

public class Funcionario {
    private String tipo = "Funcionario";
    private int salarioBase = 1000;

    public int getSalario(int dias) {
        return salarioBase + (dias * 100);
    }

    @Override
    public String toString() {
        return tipo;
    }

}
