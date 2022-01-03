package semana03.exercicio09;

public class FuncionarioConcursado extends Funcionario {
    private String tipo = "Concursado";
    private int salarioBase = 1500;

    @Override
    public int getSalario(int dias) {
        int adicional = dias * 5;
        if (adicional > 65) adicional = 65;
        return salarioBase + (salarioBase * adicional / 100);
    }

    @Override
    public String toString() {
        return tipo;
    }
}
